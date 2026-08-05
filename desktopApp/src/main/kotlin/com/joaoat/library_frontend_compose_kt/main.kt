package com.joaoat.library_frontend_compose_kt

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kotlinx.coroutines.runBlocking

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "library_frontend_compose_kt",
    ) {
        App()
    }
}