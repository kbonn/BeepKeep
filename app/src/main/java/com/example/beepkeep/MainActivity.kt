package com.example.beepkeep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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