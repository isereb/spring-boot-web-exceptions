package com.isereb.web.exceptions

import org.springframework.http.HttpStatus

class WebErrors {
    companion object {

        fun notFound(message: String) =
                SimpleWebError(HttpStatus.NOT_FOUND, message)

        fun badRequest(message: String) =
                SimpleWebError(HttpStatus.BAD_REQUEST, message)

        fun badRequest(message: String, description: String, vararg fields: ErroneousField) =
                ValidationWebError(HttpStatus.BAD_REQUEST, message, description, fields)
    }
}
