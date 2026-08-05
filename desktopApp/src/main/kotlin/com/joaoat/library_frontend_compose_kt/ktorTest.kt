package com.joaoat.library_frontend_compose_kt

import com.joaoat.library_frontend_compose_kt.dtos.BookDTO
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.json.Json

suspend fun ktorTest(): List<BookDTO> {
    val client = HttpClient(CIO) {
        defaultRequest {
            url("http://localhost:8080/")
        }
    }
    val response: HttpResponse = client.get("book/all")
    println(
        "-------------------------------\n" +
        "ktorTest got the following from the server:\n" +
        response.bodyAsText() + "\n" +
        "-------------------------------\n"
    )
    client.close()

    return Json.decodeFromString(response.bodyAsText())
}