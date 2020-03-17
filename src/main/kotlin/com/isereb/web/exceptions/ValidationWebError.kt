package com.isereb.web.exceptions

import org.springframework.http.HttpStatus

class ValidationWebError(
        status: HttpStatus,
        message: String,
        description: String?,
        private val fields: Array<out ErroneousField>)
    : InternalException(status, message, description), WebError {

    override fun status(): HttpStatus = status
    override fun message(): String = message
    override fun description(): String? = message
    override fun fields(): Array<out ErroneousField> = fields
}
