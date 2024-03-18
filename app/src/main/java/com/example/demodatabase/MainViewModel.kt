package com.example.demodatabase

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demodatabase.db.MovieDatabase
import com.example.demodatabase.db.Repository
import com.example.demodatabase.db.getDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val repository = Repository(getDatabase(application))

    val data = repository.movies

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.prepopulateDB()
        }
    }

}