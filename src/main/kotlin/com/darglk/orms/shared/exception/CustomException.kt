package com.darglk.orms.shared.exception

import org.springframework.http.ResponseEntity


abstract class CustomException(errorMsg: String, private val statusCode: Int) : RuntimeException(errorMsg) {
    abstract fun serializeErrors(): List<ErrorResponse>
    
    companion object {
        fun handleCustomException(ex: CustomException): ResponseEntity<*> {
            return ResponseEntity.status(ex.statusCode).body(mapOf(Pair("errors", ex.serializeErrors())))
        }
    }
}