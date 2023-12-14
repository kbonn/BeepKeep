package com.example.beepkeep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.BeepKeepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeepKeepTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BeepKeepApp()
                }
            }
        }
    }
}

@Composable
fun BeepKeepApp() {
    Column {
        Spacer(modifier = Modifier.weight(1f))
        BPEntryBox(modifier = Modifier.weight(2f))
        Spacer(modifier = Modifier.weight(1f))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SystolicRow() {
    var systolicText by remember { mutableStateOf("") }
    var systolicColor: Color by remember { mutableStateOf(Color.Gray) }

    if (systolicText.isNotBlank()) {
        systolicColor = when (systolicText.toInt()){
            in 20 .. 119 -> Color.Green
            in 120 .. 139 -> Color.Yellow
            in 140 .. 180 -> Color.Red
            else -> Color.Gray
        }
    } else {
        systolicColor = Color.Transparent
    }

    Row {
        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(shape)
                .background(systolicColor)
                .align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.weight(1f))
        OutlinedTextField(
            value = systolicText,
            onValueChange = { systolicText = it },
            label = { Text("Systolic") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .padding(end = 8.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiastolicRow() {
    var diastolicText by remember { mutableStateOf("") }
    var diastolicColor: Color by remember { mutableStateOf(Color.Gray) }

    if (diastolicText.isNotBlank()) {
        diastolicColor = when (diastolicText.toInt()){
            in 1 .. 79 -> Color.Green
            in 80 .. 90 -> Color.Yellow
            in 90 .. 120 -> Color.Red
            else -> Color.Gray
        }
    } else {
        diastolicColor = Color.Transparent
    }

    Row {
        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(shape)
                .background(diastolicColor)
                .align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.weight(1f))
        OutlinedTextField(
            value = diastolicText,
            onValueChange = { diastolicText = it },
            label = { Text("Diastolic") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .padding(end = 8.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PulseRow() {
    var pulseText by remember { mutableStateOf("") }
    var pulseColor: Color by remember { mutableStateOf(Color.Gray) }

    if (pulseText.isNotBlank()) {
        pulseColor = when (pulseText.toInt()){
            in 0 .. 79 -> Color.Green
            in 80 .. 90 -> Color.Yellow
            in 90 .. 120 -> Color.Red
            else -> Color.Gray
        }
    }

    Row {
        Spacer(modifier = Modifier.weight(1f))
        OutlinedTextField(
            value = pulseText,
            onValueChange = { pulseText = it },
            label = { Text("Pulse") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .padding(end = 8.dp)
        )
    }
}

@Preview
@Composable
fun BeepKeepAppPreview() {
    BeepKeepTheme(useDarkTheme = false) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            BeepKeepApp()
        }
    }
}

@Preview
@Composable
fun BeepKeepAppDarkThemePreview() {
    BeepKeepTheme(useDarkTheme = true) {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            BeepKeepApp()
        }
    }
}