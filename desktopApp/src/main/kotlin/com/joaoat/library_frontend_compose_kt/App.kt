package com.joaoat.library_frontend_compose_kt

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.joaoat.library_frontend_compose_kt.dtos.BookDTO
import kotlinx.coroutines.runBlocking

@Composable
@Preview
fun App() {

    var sampleBooks: List<BookDTO>?
    runBlocking { //TODO: remove this block and learn how to integrate data received by ktor with the UI
        sampleBooks = ktorTest()
    }

    BookGrid(sampleBooks ?: emptyList())
}