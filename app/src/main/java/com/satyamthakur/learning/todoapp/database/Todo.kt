package com.satyamthakur.learning.todoapp.database

import android.icu.text.CaseMap.Title
import androidx.room.Entity

@Entity(tableName = "todos")
data class Todo(
    val id: Int,
    val title: String,
    val description: String,
    val isDone: Boolean
)