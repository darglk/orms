package com.darglk.orms.shared.exception

import org.springframework.http.HttpStatus


class NotFoundException(private val msg: String) : CustomException(msg, HttpStatus.NOT_FOUND.value()) {
    override fun serializeErrors(): List<ErrorResponse> {
        return listOf(ErrorResponse(this.msg, null))
    }
}