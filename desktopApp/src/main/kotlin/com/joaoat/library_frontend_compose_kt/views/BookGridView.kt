package com.joaoat.library_frontend_compose_kt.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joaoat.library_frontend_compose_kt.dtos.BookDTO
import com.joaoat.library_frontend_compose_kt.view_models.BookGridViewModel

@Composable
fun BookGridView(viewModel: BookGridViewModel = BookGridViewModel() ) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        LazyVerticalGrid(
            columns = GridCells.FixedSize(500.dp),
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .widthIn(max = 2000.dp)
                .fillMaxHeight()
            .background(Color.Green),
        ) {
            items(viewModel.books) { book ->
                BookGridItem(book)
            }
        }
    }
}

@Composable
fun BookGridItem(book: BookDTO) {

    Column(
        modifier = Modifier
            .padding(20.dp)
            .dropShadow(
                shape = RoundedCornerShape(20.dp),
                shadow = Shadow(
                    radius = 7.dp,
                    spread = 0.dp,
                    offset = DpOffset(x = 5.dp, y = 5.dp),
                    color = Color(0xAA, 0xAA, 0xAA)
                )
            )
            .background(Color.White, shape = RoundedCornerShape(20.dp))
            .padding(40.dp)
            .height(200.dp),

    ){
        Text(
            text = book.title,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 10.dp),
        )
        Text(
            text = book.author,
            fontSize = 20.sp,
        )
    }
}