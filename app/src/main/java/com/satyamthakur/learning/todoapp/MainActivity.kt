package com.satyamthakur.learning.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.satyamthakur.learning.todoapp.repository.TodoRepository
import com.satyamthakur.learning.todoapp.viewmodel.MainViewModel
import com.satyamthakur.learning.todoapp.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val repository = TodoRepository()

        viewModel = ViewModelProvider(this, MainViewModelFactory(repository))

    }
}