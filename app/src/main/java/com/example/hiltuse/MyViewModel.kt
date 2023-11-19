package com.example.hiltuse

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.launch
import javax.inject.Inject

@ActivityRetainedScoped
class MyViewModel @Inject constructor() : ViewModel() {

    fun loadData() {
        viewModelScope.launch {

        }
    }
}