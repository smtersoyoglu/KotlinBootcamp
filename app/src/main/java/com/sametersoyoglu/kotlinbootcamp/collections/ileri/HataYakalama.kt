package com.sametersoyoglu.kotlinbootcamp.collections.ileri

fun main() {
    // 1. Compile error - asağıda ornek hatası
    val x = 10
    //x = 300


    // 2. Exception : Runtime Error - uygulamayı cökerten hatalara(yapılara) deniyor.
    val a = 10
    val b = 2
    // Bu şekilde çalışır ama örneğin b deki 2 değerini 0 yaparsak hata verir uygulamayı cökertir.
    //println("Sonuç : ${a / b}")
    //println("İşlem Tamam")

    // try catch ile hata kontrolü yapabiliriz hata yoksa işlemi yap hata varsa mesaj ver gibi işlem yapabiliriz.
    try {
        println("Sonuç : ${a / b}")
        println("İşlem Tamam")
    }catch (e : Exception) {
        println("İkinci sayı sıfır olamaz")
    }
}