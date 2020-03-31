package com.isereb.web.exceptions.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.isereb.web.exceptions.InternalException
import org.springframework.http.HttpStatus

class ValidationWebError(
        status: HttpStatus,
        message: String,
        description: String?,
        private val fields: Array<out ErroneousField>)
    : InternalException(status, message, description), WebError {

    @JsonProperty override fun status(): HttpStatus = status
    @JsonProperty override fun message(): String = message
    @JsonProperty override fun description(): String? = message
    @JsonProperty override fun fields(): Array<out ErroneousField> = fields
}
