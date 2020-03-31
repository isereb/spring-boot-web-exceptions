package com.isereb.web.exceptions.dto

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import org.springframework.http.HttpStatus

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        creatorVisibility = JsonAutoDetect.Visibility.NONE)
@JsonSerialize
interface WebError {
    fun status(): HttpStatus
    fun message(): String
    fun description(): String?
    fun fields(): Array<out ErroneousField> = emptyArray()
}
