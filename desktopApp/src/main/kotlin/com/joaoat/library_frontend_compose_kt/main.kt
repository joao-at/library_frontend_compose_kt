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
        runBlocking { //TODO: remove this block and learn how to integrate data received by ktor with the UI
            ktorTest()
        }

    }
}