package com.isereb.web.exceptions

import com.isereb.web.exceptions.dto.SimpleWebError
import org.springframework.http.HttpStatus

class ServerErrors {

    companion object {
        @JvmStatic fun internalError(message: String, description: String?) =
                SimpleWebError(HttpStatus.INTERNAL_SERVER_ERROR, message, description)

        @JvmStatic fun notImplemented(message: String, description: String?) =
                SimpleWebError(HttpStatus.NOT_IMPLEMENTED, message, description)

        @JvmStatic fun badGateway(message: String, description: String?) =
                SimpleWebError(HttpStatus.BAD_GATEWAY, message, description)

        @JvmStatic fun serviceUnavailable(message: String, description: String?) =
                SimpleWebError(HttpStatus.SERVICE_UNAVAILABLE, message, description)
    }
}
