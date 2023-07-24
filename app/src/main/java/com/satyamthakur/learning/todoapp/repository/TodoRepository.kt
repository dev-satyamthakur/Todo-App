package com.satyamthakur.learning.todoapp.repository

import androidx.lifecycle.LiveData
import com.satyamthakur.learning.todoapp.database.Todo
import com.satyamthakur.learning.todoapp.database.TodoDao

class TodoRepository(private val todoDao: TodoDao) {

    private val allTodo: LiveData<List<Todo>> = todoDao.getAllTodo()

    fun getAllTodo(): LiveData<List<Todo>> = allTodo

    suspend fun insertTodo(todo: Todo) {
        todoDao.insertTodo(todo)
    }
}