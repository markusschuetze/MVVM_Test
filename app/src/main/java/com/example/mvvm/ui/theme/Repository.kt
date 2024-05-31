package com.example.mvvm.ui.theme

import com.example.mvvm.Todo
import com.example.mvvm.TodoDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TodoRepository(private val todoDao: TodoDao) {
    suspend fun getAllTodos(): List<Todo> = withContext(Dispatchers.IO) {
        todoDao.getAllTodos()
    }

    suspend fun insert(todo: Todo) = withContext(Dispatchers.IO) {
        todoDao.insert(todo)
    }
}
