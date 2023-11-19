package com.example.hiltuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltuse.hilt.Truck
import com.example.hiltuse.http.ApiService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck: Truck

    @Inject
    lateinit var apiService: ApiService

    @Inject
    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        truck.deliver()

        viewModel.loadData()
    }
}