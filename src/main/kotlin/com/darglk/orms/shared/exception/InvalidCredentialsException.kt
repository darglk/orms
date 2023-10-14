package com.darglk.orms.shared.exception

import com.darglk.orms.users.domain.LoginRequest
import jakarta.validation.ConstraintViolation
import org.springframework.http.HttpStatus
import org.springframework.security.core.AuthenticationException

class InvalidCredentialsException(msg: String, validationResult: Set<ConstraintViolation<LoginRequest>>) : AuthenticationException(msg) {
    private val statusCode = HttpStatus.BAD_REQUEST.value()
    private val validationResult: Set<ConstraintViolation<LoginRequest>>
    
    init {
        this.validationResult = validationResult
    }
    
    fun serializeErrors(): List<ErrorResponse> {
        return validationResult
            .map { result: ConstraintViolation<LoginRequest> -> ErrorResponse(result.message, result.propertyPath.toString()) }
            .toList()
    }
}