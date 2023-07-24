package com.satyamthakur.learning.todoapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {
    @Query("SELECT * FROM todos ORDER BY ID DESC")
    fun getAllTodo(): LiveData<List<Todo>>

    @Insert
    suspend fun insertTodo(todo: Todo): Long
}