package com.darglk.orms.users.internal.application

import com.darglk.orms.users.domain.User
import com.darglk.orms.users.domain.UsersFetchedEvent
import com.darglk.orms.users.port.`in`.GetUsersQuery
import com.darglk.orms.users.internal.application.port.out.GetUsersPort
import org.springframework.context.ApplicationEventPublisher
import org.springframework.modulith.ApplicationModuleListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.UUID

@Service
@Transactional
internal class UserService(
    private val getUsersPort: GetUsersPort,
    private val eventPublisher: ApplicationEventPublisher
) : GetUsersQuery {
    override fun getUsers(): List<User> {
        eventPublisher.publishEvent(UsersFetchedEvent(UUID.randomUUID().toString()))
        return getUsersPort.getUsers()
    }
    
    @Async
    @ApplicationModuleListener
    fun usersEventListener(event: UsersFetchedEvent) {
        println("Got event: ${event.id}")
    }
}

