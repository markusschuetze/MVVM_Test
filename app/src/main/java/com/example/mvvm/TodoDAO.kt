package com.example.mvvm

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {
    @Query("SELECT * FROM todos")
    fun getAllTodos(): List<Todo>

    @Insert
    fun insert(todo: Todo)
}
