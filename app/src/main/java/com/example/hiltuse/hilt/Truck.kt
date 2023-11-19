package com.example.hiltuse.hilt

import android.util.Log
import javax.inject.Inject

class Truck @Inject constructor(val driver: Driver) {
    @Inject
    lateinit var engine: Engine

    fun deliver() {
        engine.start()
        Log.i("minfo", "Truck is delivering cargo driver by $driver")
        engine.shutdown()
    }
}

class Driver @Inject constructor() {

}