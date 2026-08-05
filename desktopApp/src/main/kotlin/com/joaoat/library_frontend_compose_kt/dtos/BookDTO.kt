package com.joaoat.library_frontend_compose_kt.dtos

import kotlinx.serialization.Serializable

@Serializable
data class BookDTO(
    val id: Long,
    val title: String,
    val author: String,
)