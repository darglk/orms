package com.darglk.orms.shared.exception

import jakarta.validation.ConstraintViolationException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(value = [CustomException::class])
    fun handleCustomException(ex: CustomException): ResponseEntity<*> {
        return CustomException.handleCustomException(ex)
    }
    
    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun handleConstraintViolation(ex: ConstraintViolationException): ResponseEntity<*> {
        val errors = ex.constraintViolations.map { ErrorResponse(it.propertyPath.toString(), it.message) }
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(mapOf(Pair("errors", errors)))
    }
}