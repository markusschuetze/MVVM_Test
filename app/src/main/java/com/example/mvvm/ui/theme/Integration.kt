package com.example.mvvm.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.unit.ExperimentalUnitApi
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalUnitApi
class MainActivity : ComponentActivity() {
    @ExperimentalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Implementierung der Activity mit dem ViewModel
        }
    }
}
