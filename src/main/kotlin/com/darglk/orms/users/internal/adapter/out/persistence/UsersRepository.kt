package com.darglk.orms.users.internal.adapter.out.persistence

import nu.studer.sample.orms.tables.UsersUsers.USERS_USERS
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
internal class UsersRepository(
    private val db: DSLContext
) {
    fun getUsers(): List<UserEntity> {
        return db.select(USERS_USERS.ID, USERS_USERS.EMAIL)
            .from(USERS_USERS)
            .fetchInto(UserEntity::class.java)
    }
}