package com.darglk.orms.users.internal.adapter.out.persistence

import com.darglk.orms.users.domain.User
import com.darglk.orms.users.internal.application.port.out.GetUsersPort
import org.springframework.stereotype.Component

@Component
internal class UsersPersistenceAdapter(
    private val usersRepository: UsersRepository
) : GetUsersPort {
    override fun getUsers(): List<User> {
        return usersRepository.getUsers().map {
            User(it.id, it.email)
        }
    }
}