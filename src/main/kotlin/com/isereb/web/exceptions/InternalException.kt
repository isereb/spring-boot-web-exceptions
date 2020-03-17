package com.isereb.web.exceptions

import org.springframework.http.HttpStatus

abstract class InternalException(val status: HttpStatus,
                                 override val message: String,
                                 val description: String?) : RuntimeException(message, null, true, false)
