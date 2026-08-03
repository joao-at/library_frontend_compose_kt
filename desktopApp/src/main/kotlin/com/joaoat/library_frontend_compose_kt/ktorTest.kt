package com.joaoat.library_frontend_compose_kt

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun ktorTest() {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("http://localhost:8080/book/all")
    println(
        "-------------------------------\n" +
        "ktorTest got the following from the server:\n" +
        response.bodyAsText() + "\n" +
        "-------------------------------\n"
    )
    client.close()
}