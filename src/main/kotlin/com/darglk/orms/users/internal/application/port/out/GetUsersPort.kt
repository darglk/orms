package com.darglk.orms.users.internal.application.port.out

import com.darglk.orms.users.domain.User

interface GetUsersPort {
    fun getUsers(): List<User>
}