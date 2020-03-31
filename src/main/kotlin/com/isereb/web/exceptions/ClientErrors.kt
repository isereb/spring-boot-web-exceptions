package com.isereb.web.exceptions

import com.isereb.web.exceptions.dto.ErroneousField
import com.isereb.web.exceptions.dto.SimpleWebError
import com.isereb.web.exceptions.dto.ValidationWebError
import org.springframework.http.HttpStatus

/**
 * Static factory for construction of different kinds of exceptions
 */
class ClientErrors {

    companion object {

        @JvmStatic fun notFound(message: String) =
                SimpleWebError(HttpStatus.NOT_FOUND, message, null)

        @JvmStatic fun notFound(message: String, description: String?) =
                SimpleWebError(HttpStatus.NOT_FOUND, message, description)

        @JvmStatic fun badRequest(message: String) =
                SimpleWebError(HttpStatus.BAD_REQUEST, message, null)

        @JvmStatic fun badRequest(message: String, description: String?) =
                SimpleWebError(HttpStatus.BAD_REQUEST, message, description)

        @JvmStatic fun badRequest(message: String, description: String, vararg fields: ErroneousField) =
                ValidationWebError(HttpStatus.BAD_REQUEST, message, description, fields)

        @JvmStatic fun unauthorized(message: String) =
                SimpleWebError(HttpStatus.UNAUTHORIZED, message, null)

        @JvmStatic fun unauthorized(message: String, description: String?) =
                SimpleWebError(HttpStatus.UNAUTHORIZED, message, description)

        @JvmStatic fun forbidden(message: String) =
                SimpleWebError(HttpStatus.FORBIDDEN, message, null)

        @JvmStatic fun forbidden(message: String, description: String?) =
                SimpleWebError(HttpStatus.FORBIDDEN, message, description)

    }
}
