package com.joaoat.library_frontend_compose_kt

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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

@Composable
fun BookGrid() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        LazyVerticalGrid(

            columns = GridCells.FixedSize(330.dp), // 2 columns
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .widthIn(max = 2000.dp) // (330 + 10) * 3
                .fillMaxHeight()
            .background(Color.Green),

        ) {
            items(5) { _ ->
                Book()
            }
        }
    }
}

@Composable
fun Book(){

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
            .padding(40.dp),

    ){
        Text(
            text = "Book Title",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Book Author",
            fontSize = 20.sp,
        )
    }
}