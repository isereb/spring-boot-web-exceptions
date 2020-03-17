package com.isereb.web.exceptions.dto

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.isereb.web.exceptions.dto.ErroneousField
import org.springframework.http.HttpStatus

@JsonSerialize
interface WebError {
    fun status(): HttpStatus
    fun message(): String
    fun description(): String?
    fun fields(): Array<out ErroneousField> = emptyArray()
}
