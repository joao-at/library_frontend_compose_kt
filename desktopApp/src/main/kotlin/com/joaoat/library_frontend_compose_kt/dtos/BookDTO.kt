package com.joaoat.library_frontend_compose_kt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class BookDTO(
    val id: Long = -1,
    val title: String = "error",
    val author: String = "error",
)