package com.isereb.web.exceptions

import com.isereb.web.exceptions.dto.SimpleWebError
import org.springframework.http.HttpStatus

class ServerErrors {

    companion object {

        @JvmStatic fun internalError(message: String) =
                SimpleWebError(HttpStatus.INTERNAL_SERVER_ERROR, message, null)

        @JvmStatic fun internalError(message: String, description: String?) =
                SimpleWebError(HttpStatus.INTERNAL_SERVER_ERROR, message, description)

        @JvmStatic fun notImplemented(message: String) =
                SimpleWebError(HttpStatus.NOT_IMPLEMENTED, message, null)

        @JvmStatic fun notImplemented(message: String, description: String?) =
                SimpleWebError(HttpStatus.NOT_IMPLEMENTED, message, description)

        @JvmStatic fun badGateway(message: String) =
                SimpleWebError(HttpStatus.BAD_GATEWAY, message, null)

        @JvmStatic fun badGateway(message: String, description: String?) =
                SimpleWebError(HttpStatus.BAD_GATEWAY, message, description)

        @JvmStatic fun serviceUnavailable(message: String) =
                SimpleWebError(HttpStatus.SERVICE_UNAVAILABLE, message, null)

        @JvmStatic fun serviceUnavailable(message: String, description: String?) =
                SimpleWebError(HttpStatus.SERVICE_UNAVAILABLE, message, description)
    }
}
