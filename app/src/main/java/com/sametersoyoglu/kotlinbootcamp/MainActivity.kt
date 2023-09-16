package com.sametersoyoglu.kotlinbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // lateinit  daha sonra başlatacağım anlamına gelir
    lateinit var str2 : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "Merhaba"

    }
}