package com.gdsdevtec.ecommrcecompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdsdevtec.ecommrcecompose.ui.theme.Blue
import com.gdsdevtec.ecommrcecompose.ui.theme.White


@Composable
fun EcommerceAppBar(
    modifier: Modifier = Modifier,
    title: String,
    onClickBackArrow: (() -> Unit)?,
) {
    TopAppBar(
        modifier = modifier.height(70.dp),
        title = {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = modifier.fillMaxWidth(),
            ) {
                Text(
                    title.uppercase(),
                    overflow = TextOverflow.Clip,
                    style = TextStyle(color = Color.White, fontWeight = FontWeight(500)),
                    fontSize = 20.sp,
                )
            }
        },
        navigationIcon = onClickBackArrow?.let { safe ->
            {
                IconButton(onClick = { safe() }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = null)
                }
            }
        },
        backgroundColor = Blue,
        actions = {
            // RowScope here, so these icons will be placed horizontally
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Menu, contentDescription = "Localized description")
            }
        },
        elevation = 5.dp,
        contentColor = White
    )
}


@Preview
@Composable
fun previewEcommerceAppBar() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EcommerceAppBar(title = "gabriel", modifier = Modifier) {}
    }
}