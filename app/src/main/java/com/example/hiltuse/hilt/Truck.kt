package com.example.hiltuse.hilt

import android.util.Log
import javax.inject.Inject

class Truck @Inject constructor(val driver: Driver) {

    fun deliver() {
        Log.i("minfo", "Truck is delivering cargo driver by $driver")
    }
}

class Driver @Inject constructor() {

}