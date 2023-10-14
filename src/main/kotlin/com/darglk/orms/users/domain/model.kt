package com.darglk.orms.users.domain

data class User(
    val id: String,
    val email: String
)

data class LoginRequest(
    val email: String,
    val password: String
)

data class UsersFetchedEvent(
    val id: String
)