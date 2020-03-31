package com.isereb.web.exceptions.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.isereb.web.exceptions.InternalException
import org.springframework.http.HttpStatus

class SimpleWebError(
        status: HttpStatus,
        message: String,
        description: String?)
    : InternalException(status, message, description), WebError {

    constructor(status: HttpStatus, message: String) : this(status, message, null)

    @JsonProperty override fun status(): HttpStatus = status
    @JsonProperty override fun message(): String = message
    @JsonProperty override fun description(): String? = description
}
