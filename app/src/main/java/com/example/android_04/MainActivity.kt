package com.example.android_04

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_random.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(v: View?) {
//                if (edt_From.text == "" || edt_To.text == "") return
                val chuoi1 = edt_From.text.toString()
                val chuoi2 = edt_To.text.toString()
                if (chuoi1 == "" || chuoi2 == "") return
                val so1 = chuoi1.toInt()
                val so2: Int = chuoi2.toInt()
                val random = Random

                var so: Int = 0
                if (so1 < so2) {
                    so = random.nextInt(so1, so2)
                } else {
                    so = random.nextInt(so2, so1)
                }
                tv_random.setText(so.toString() + "")
                println("==============>$so")

            }

        })


    }


}