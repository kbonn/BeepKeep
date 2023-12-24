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
import com.example.beepkeep.model.Entry
import com.example.beepkeep.model.SampleRepo
import com.example.compose.BeepKeepTheme

@Composable
fun LargeNumberColumn() {
    LazyColumn {
        items(SampleRepo.entries) { entry ->
            NumberRow(entry = entry)
        }
    }
}

@Composable
fun NumberRow(entry: Entry) {
    Row {
        Text(text = entry.systolic.toString(), modifier = Modifier.weight(1f))
        Text(text = entry.diastolic.toString(), modifier = Modifier.weight(1f))
        Text(text = entry.pulse.toString(), modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun LargeNumberColumnPreview() {
    BeepKeepTheme(useDarkTheme = false) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            LargeNumberColumn()
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
            LargeNumberColumn()
        }
    }
}