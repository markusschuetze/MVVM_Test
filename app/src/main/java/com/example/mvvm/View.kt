package com.example.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    private val timerViewModel: TimerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimerApp(timerViewModel)
        }
    }
}

@Composable
fun TimerApp(timerViewModel: TimerViewModel = viewModel()) {
    val time by timerViewModel.time.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Time: $time seconds", style = MaterialTheme.typography.h4)

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Button(onClick = { timerViewModel.startTimer() }) {
                    Text("Start")
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(onClick = { timerViewModel.stopTimer() }) {
                    Text("Stop")
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(onClick = { timerViewModel.resetTimer() }) {
                    Text("Reset")
                }
            }
        }
    }
}
