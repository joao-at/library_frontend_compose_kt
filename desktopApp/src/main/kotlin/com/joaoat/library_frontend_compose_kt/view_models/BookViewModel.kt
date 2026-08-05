package com.joaoat.library_frontend_compose_kt.view_models

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joaoat.library_frontend_compose_kt.dtos.BookDTO
import com.joaoat.library_frontend_compose_kt.ktorTest
import kotlinx.coroutines.launch

class BookViewModel : ViewModel() {

    var books by mutableStateOf(listOf<BookDTO>())
        private set

    init {
        viewModelScope.launch() {
            try {
                books = ktorTest()
            } catch (e: Exception) {
                books = emptyList()
            }
        }
    }
}