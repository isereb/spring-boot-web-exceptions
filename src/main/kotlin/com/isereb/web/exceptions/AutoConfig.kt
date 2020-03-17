package com.isereb.web.exceptions

import com.isereb.web.exceptions.dto.WebError
import org.springframework.context.annotation.Configuration
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@Configuration
@ControllerAdvice
class AutoConfig {
    @ExceptionHandler(InternalException::class)
    fun handleInternalException(ex: InternalException): ResponseEntity<WebError> =
            ResponseEntity
                    .status(ex.status)
                    .body(if (ex is WebError) ex else null)
}
