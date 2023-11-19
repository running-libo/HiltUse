package com.example.hiltuse.hilt

import android.util.Log
import javax.inject.Inject

class ElectricEngine @Inject constructor() : Engine {

    override fun start() {
        Log.i("minfo", "ElectricEngine start")
    }

    override fun shutdown() {
        Log.i("minfo", "ElectricEngine start")
    }
}