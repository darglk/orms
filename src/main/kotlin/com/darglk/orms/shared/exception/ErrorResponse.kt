package com.darglk.orms.shared.exception

import com.fasterxml.jackson.annotation.JsonInclude

data class ErrorResponse(
    val message: String,
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val field: String?
)
