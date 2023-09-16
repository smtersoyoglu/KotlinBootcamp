package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

fun main() {

    // Tanimlama
    var str : String? = null

    //str = "Merhaba"

    // yöntem 1 ? ile null olabiliceğini söyleriz hata vermemesi için
    println("Yöntem 1 : ${str?.trim()}")

    // Yöntem 2 !! çift ünlem kullanarak null olmadığından eminiz devam et deriz.
    println("Yöntem 2 : ${str!!.trim()}")

    // Yöntem 3 null kontrolü yaparak null olup olmadığına göre hareket et deriz.
    if (str != null) {
        println("Yöntem 3 :${str.trim()}")
    }else
        println("Sonuç null dır.")

    // Yöntem 4 yukarıdaki gibi if ile kontrol ettiğimiz gibi let ile de kontrol edebiliriz daha az kodla
    str?.let {
        println("Yöntem 4 : ${str.trim()}")
    }
}