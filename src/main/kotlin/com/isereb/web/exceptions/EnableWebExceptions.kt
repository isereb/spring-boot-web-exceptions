package com.isereb.web.exceptions

import org.springframework.context.annotation.Import

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
@Import(WebExceptionsConfiguration::class)
annotation class EnableWebExceptions
