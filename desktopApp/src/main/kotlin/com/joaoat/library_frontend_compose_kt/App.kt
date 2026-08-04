package com.joaoat.library_frontend_compose_kt

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.joaoat.library_frontend_compose_kt.dtos.BookDTO

@Composable
@Preview
fun App() {

    val sampleBooks = listOf(
        BookDTO(id = 0L, title = "Amarelo - História de uma cor", author = "Michel Pastoureau"),
        BookDTO(id = 1L, title = "Steve Jobs", author = "Walter Isaacson"),
        BookDTO(id = 2L, title = "Mansfield Park", author = "Jane Austen"),
        BookDTO(id = 3L, title = "Nikola Tesla", author = "Aleksandar Marincic"),
        BookDTO(id = 4L, title = "The Creative Gene", author = "Hideo Kojima"),
        BookDTO(id = 5L, title = "Mindfulness in Pain English", author = "Bhante Gunaratana")
    )

    BookGrid(sampleBooks)
}