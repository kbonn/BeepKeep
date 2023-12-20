package com.example.beepkeep

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.compose.BeepKeepTheme

@Composable
fun TitleBox(
    modifier: Modifier = Modifier,
    titleMargin: Dp = 8.dp, // Adjust spacing as needed
    subtitleColor: Color = Color.Gray, // Customize subtitle color
) {
    Box(
        modifier = modifier.padding(16.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "BeepKeep",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = titleMargin)
            )
            Text(
                text = "The app where you keep your beep",
                style = MaterialTheme.typography.bodyMedium,
                color = subtitleColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TitleBoxPreview() {
    BeepKeepTheme(useDarkTheme = false) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            TitleBox()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TitleBoxPreviewDarkTheme() {
    BeepKeepTheme(useDarkTheme = true) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            TitleBox()
        }
    }
}