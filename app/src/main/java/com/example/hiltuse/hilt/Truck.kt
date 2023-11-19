package com.example.hiltuse.hilt

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class Truck @Inject constructor(@ActivityContext val context: Context, val driver: Driver) {
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