package com.example.beepkeep

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.BeepKeepTheme

@Composable
fun BPEntryBox(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
        ) {
            SystolicRow()
            DiastolicRow()
            PulseRow()
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(16.dp)
            ) {
                Text(text = "Submit")
            }
        }

    }
}

@Preview
@Composable
fun BeepKeepPreview() {
    BeepKeepTheme(useDarkTheme = false) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            BPEntryBox()
        }
    }
}

@Preview
@Composable
fun BeepKeepDarkThemePreview() {
    BeepKeepTheme(useDarkTheme = true) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            BPEntryBox()
        }
    }
}