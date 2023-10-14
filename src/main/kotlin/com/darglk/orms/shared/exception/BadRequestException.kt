package com.darglk.orms.shared.exception

import org.springframework.http.HttpStatus


class BadRequestException(private val errorMsg: String) : CustomException(errorMsg, HttpStatus.BAD_REQUEST.value()) {
    override fun serializeErrors(): List<ErrorResponse> {
        return listOf(ErrorResponse(errorMsg, null))
    }
}