package com.joaoat.library_frontend_compose_kt.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joaoat.library_frontend_compose_kt.view_models.BookViewModel

@Composable
fun BookView(viewModel: BookViewModel = BookViewModel(0)) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier
                .width(2000.dp)
                .fillMaxHeight()
                .background(Color.White)
                .padding(50.dp),
        ) {

            Text(
                text = viewModel.book.title,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 10.dp),
            )
            Text(
                text = viewModel.book.author,
                fontSize = 20.sp,
            )
        }
    }
}