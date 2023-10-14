package com.darglk.orms.shared

import jakarta.validation.ConstraintViolationException
import jakarta.validation.Validation
import jakarta.validation.Validator

@Suppress("UNCHECKED_CAST")
abstract class SelfValidating<T>(
    private val validator: Validator = Validation.buildDefaultValidatorFactory().validator
) {

    protected fun validateSelf() {
        val violations = validator.validate(this as T)
        if (violations.isNotEmpty()) {
            throw ConstraintViolationException(violations)
        }
    }
}