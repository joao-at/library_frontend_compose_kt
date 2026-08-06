package com.joaoat.library_frontend_compose_kt

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.joaoat.library_frontend_compose_kt.network.HttpConnection

fun main() = application {
    Window(
        onCloseRequest = {
            HttpConnection.client.close()
            exitApplication()
        },
        title = "library_frontend_compose_kt",
    ) {
        App()
    }
}