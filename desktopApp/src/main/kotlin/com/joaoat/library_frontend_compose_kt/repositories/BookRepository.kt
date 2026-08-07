package com.joaoat.library_frontend_compose_kt.repositories

import com.joaoat.library_frontend_compose_kt.dtos.BookDTO
import com.joaoat.library_frontend_compose_kt.network.HttpConnection
import kotlinx.serialization.json.Json

class BookRepository {

    private val connection = HttpConnection

    suspend fun getAllBooks(): List<BookDTO> {
        val stringBody = connection.getBodyAsString("book/all")

        return try {
            Json.decodeFromString(stringBody)
        } catch (_: Exception) {
            emptyList()
        }
    }

    suspend fun getBook(id: Long): BookDTO {
        val stringBody = connection.getBodyAsString("book/$id")

        return try {
            Json.decodeFromString(stringBody)
        } catch (_: Exception) {
            BookDTO()
        }
    }

}