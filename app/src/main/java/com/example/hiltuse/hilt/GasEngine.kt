package com.example.hiltuse.hilt

import android.util.Log
import javax.inject.Inject

class GasEngine @Inject constructor() : Engine {

    override fun start() {
        Log.i("minfo", "GasEngine start")
    }

    override fun shutdown() {
        Log.i("minfo", "GasEngine shotdown")
    }

}