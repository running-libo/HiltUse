package com.example.hiltuse

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltuse.di.NetworkModule
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor() : ViewModel() {

    fun loadData() {
        viewModelScope.launch {
            NetworkModule.getService().getArticle(0)
        }
    }
}