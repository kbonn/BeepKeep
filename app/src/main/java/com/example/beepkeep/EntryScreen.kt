package com.example.beepkeep

import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class EntryScreen {
    
    @Composable
    fun BPEntryCard() {
        Card {
            DataField(label = "Systolic")
            DataField(label = "Diastolic")
            DataField(label = "Pulse")
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun DataField(label: String) {
        var text by remember { mutableStateOf(label) }

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(label) }
        )
    }
    
}