package net.geratek.api.errors.web

import org.springframework.http.HttpStatus

class SimpleWebError(
        status: HttpStatus,
        message: String,
        description: String?)
    : InternalException(status, message, description), WebError {

    constructor(status: HttpStatus, message: String) : this(status, message, null)

    override fun status(): HttpStatus = status
    override fun message(): String = message
    override fun description(): String? = description
}
