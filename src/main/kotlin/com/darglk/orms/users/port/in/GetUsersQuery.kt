package com.darglk.orms.users.port.`in`

import com.darglk.orms.users.domain.User

interface GetUsersQuery {
    fun getUsers(): List<User>
}