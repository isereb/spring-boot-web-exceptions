package net.geratek.api.errors.web

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import org.springframework.http.HttpStatus

@JsonSerialize
interface WebError {
    fun status(): HttpStatus
    fun message(): String
    fun description(): String?
    fun fields(): Array<out ErroneousField> = emptyArray()
}
