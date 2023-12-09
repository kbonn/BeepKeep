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
fun BeepKeepApp(modifier: Modifier = Modifier) {
    BPEntryCard()
}

@Composable
fun BPEntryCard() {
    var systolicColor: Color by remember { mutableStateOf(Color.Gray) }
    var diastolicColor: Color by remember { mutableStateOf(Color.Gray) }
    var pulseColor: Color by remember { mutableStateOf(Color.Gray) }

    Column {
        Spacer(modifier = Modifier.weight(1f))
        Card(
            modifier = Modifier
                .padding(16.dp)
                .weight(2f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                DataField(label = "Systolic", systolicColor)
                DataField(label = "Diastolic", diastolicColor)
                DataField(label = "Pulse", pulseColor)
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
        Spacer(modifier = Modifier.weight(1f))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataField(
    label: String,
    color: Color
    ) {
    var text by remember { mutableStateOf("") }

    Row {
        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(shape)
                .background(color)
                .align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.weight(1f))
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(label) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
}

@Preview
@Composable
fun BeepKeepPreview() {
    BeepKeepTheme(useDarkTheme = false) {
        BeepKeepApp()
    }
}

/**
 * Composable that displays what the UI of the app looks like in dark theme in the design tab.
 */
@Preview
@Composable
fun BeepKeepDarkThemePreview() {
    BeepKeepTheme(useDarkTheme = true) {
        BeepKeepApp()
    }
}