package com.joaoat.library_frontend_compose_kt

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform