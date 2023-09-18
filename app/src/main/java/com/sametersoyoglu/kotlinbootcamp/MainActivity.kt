package com.sametersoyoglu.kotlinbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // lateinit  daha sonra başlatacağım anlamına gelir
    //lateinit var str2 : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Yazılım kısmında R harfi res klasörünü temsil eder.
        // Xml kısmında @ işareti res klasörünü temsil eder.

        // Tasarımda bu kavramları duyarız
        // tasarımın solu : Left - Start - Leading
        // sağı : Right - End - Trailing   -> bu isimlerle çıkabilirler.
        // Buton un arkaplan rengini backgroundTint ile değiştiririz.

    }
}