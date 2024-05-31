package com.example.mvvm

import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvvm.ui.theme.TodoRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@ExperimentalUnitApi
fun main() {
    // Hier wird das ViewModel initialisiert
    val pomodoroViewModel = PomodoroViewModel(TodoRepository(TodoDatabase.getDatabaseInstance()))

    // Hier werden einige Testdaten hinzugefügt
    pomodoroViewModel.addTodo(Todo(title = "Todo 1", description = "Description 1"))
    pomodoroViewModel.addTodo(Todo(title = "Todo 2", description = "Description 2"))
    pomodoroViewModel.addTodo(Todo(title = "Todo 3", description = "Description 3"))

    // Hier wird die Vorschau gerendert
    Preview {
        // Die View wird gerendert und mit dem ViewModel verbunden
        PomodoroApp(pomodoroViewModel)
    }
}
