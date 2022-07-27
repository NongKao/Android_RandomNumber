package com.example.android_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Log.i("=========> " , "On create")

        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.i("=========> " , "On sstart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("=========> " , "On resume")

        super.onResume()
    }

        override fun onDestroy() {
        Log.d("=========> " , "On destroy")
        super.onDestroy()
    }
    override fun onStop() {
        Log.i("=========> " , "On stop")
        super.onStop()
    }
}