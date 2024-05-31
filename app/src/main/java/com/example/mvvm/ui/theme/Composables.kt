package com.example.mvvm.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvvm.Todo

// Pomodoro Timer Composable
@Composable
fun PomodoroTimer(modifier: Modifier = Modifier) {
    // Implementierung des Pomodoro Timer
}

// Todo-Liste Composable
@Composable
fun TodoList(
    todos: List<Todo>,
    modifier: Modifier = Modifier,
    onAddTodo: (Todo) -> Unit
) {
    // Implementierung der Todo-Liste
}

// Todo-Eingabe Composable
@Composable
fun TodoInput(
    modifier: Modifier = Modifier,
    onAddTodo: (Todo) -> Unit
) {
    // Implementierung der Todo-Eingabe
}

// Todo-Element Composable
@Composable
fun TodoItem(todo: Todo) {
    // Implementierung eines einzelnen Todo-Elements
}
