package com.joaoat.library_frontend_compose_kt.view_models

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joaoat.library_frontend_compose_kt.dtos.BookDTO
import com.joaoat.library_frontend_compose_kt.repositories.BookRepository
import kotlinx.coroutines.launch

class BookGridViewModel : ViewModel() {

    val bookRepository = BookRepository()

    var books by mutableStateOf(listOf<BookDTO>())
        private set

    init {
        viewModelScope.launch {
           books = bookRepository.getAllBooks()
        }
    }
}