package com.example.beepkeep

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.BeepKeepTheme

@Composable
fun LargeNumberColumn(data: List<Triple<Int, Int, Int>>) {
    LazyColumn {
        items(data) { (number1, number2, number3) ->
            NumberRow(number1, number2, number3)
        }
    }
}

@Composable
fun NumberRow(number1: Int, number2: Int, number3: Int) {
    Row {
        Text(text = "$number1", modifier = Modifier.weight(1f))
        Text(text = "$number2", modifier = Modifier.weight(1f))
        Text(text = "$number3", modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun LargeNumberColumnPreview() {
    BeepKeepTheme(useDarkTheme = false) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            LargeNumberColumn(
                data = listOf(
                    Triple(12, 78, 45),
                    Triple(34, 90, 11),
                    Triple(56, 23, 87),
                    Triple(78, 55, 29),
                    Triple(90, 12, 63),
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LargeNumberColumnPreviewDarkTheme() {
    BeepKeepTheme(useDarkTheme = true) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            LargeNumberColumn(
                data = listOf(
                    Triple(12, 78, 45),
                    Triple(34, 90, 11),
                    Triple(56, 23, 87),
                    Triple(78, 55, 29),
                    Triple(90, 12, 63),
                )
            )
        }
    }
}