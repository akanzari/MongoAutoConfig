package com.demp.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.axonframework.serialization.json.JacksonSerializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JsonSerializationAutoConfig {

    @Bean
    fun javaModule(): com.fasterxml.jackson.databind.Module = JavaTimeModule()

    @Bean
    fun kotlinModule(): com.fasterxml.jackson.databind.Module = KotlinModule.Builder().build()

}
