package com.example.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class PomodoroViewModel(private val todoRepository: TodoRepository) : ViewModel() {
    val todos = todoRepository.getAllTodos()

    fun addTodo(todo: Todo) {
        viewModelScope.launch {
            todoRepository.insert(todo)
        }
    }
}
