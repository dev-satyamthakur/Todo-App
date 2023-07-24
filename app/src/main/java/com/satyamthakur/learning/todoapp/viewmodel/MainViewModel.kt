package com.satyamthakur.learning.todoapp.viewmodel

import androidx.lifecycle.LiveData
import com.satyamthakur.learning.todoapp.database.Todo
import com.satyamthakur.learning.todoapp.repository.TodoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: TodoRepository) {
    val todos: LiveData<List<Todo>> = repository.getAllTodo()

    fun insertTodo(todo: Todo) {
        CoroutineScope(Dispatchers.IO).launch {
            repository.insertTodo(todo)
        }
    }
}