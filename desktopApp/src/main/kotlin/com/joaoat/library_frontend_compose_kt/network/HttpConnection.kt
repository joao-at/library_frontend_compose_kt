package com.joaoat.library_frontend_compose_kt.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

// TODO: handle server error jsons
object HttpConnection {
    val client = HttpClient(CIO) {
        defaultRequest {
            url("http://localhost:8080/")
        }
    }

    suspend fun getBodyAsString(url: String): String {
        val response = client.get(url).bodyAsText()

        println( "Debug | Ktor received: $response" )

        return response
    }
}
