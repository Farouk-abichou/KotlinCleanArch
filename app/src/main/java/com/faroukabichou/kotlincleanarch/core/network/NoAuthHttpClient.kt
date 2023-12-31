package com.faroukabichou.kotlincleanarch.core.network

import com.faroukabichou.kotlincleanarch.core.network.NetworkConstants.BASE_URL
import io.ktor.client.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

fun createNoAuthHttpClient(): HttpClient {
    return HttpClient().config {
        defaultRequest {
            url(BASE_URL)
            contentType(ContentType.Application.Json)
        }

        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }

        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.ALL
        }
    }
}