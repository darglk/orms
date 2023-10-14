package com.darglk.orms.users.internal.adapter.`in`.web

import com.darglk.orms.users.port.`in`.GetUsersQuery
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
internal class UserController(
    private val getUsersQuery: GetUsersQuery
) {
    
    @GetMapping
    fun getUsers(): List<UserResponse> {
        return getUsersQuery.getUsers().map {
            UserResponse(it.id, it.email)
        }
    }
}