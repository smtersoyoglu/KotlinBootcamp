package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

fun main() {

    //val sonuc = 5.carpi(2)
    val sonuc = 5 carpi 2
    println("Gelen Sonuç : $sonuc")
}
// Extension integer a özgü bir carpma fonksiyonu oluşturma Int.carpi ile Int class ının bir fonksiyonu oldu.
/*
fun Int.carpi(sayi:Int) : Int {
    return this * sayi // this = Int sınıfı
}
 */
// infix kullanarakta daha temiz bir görüntü ile yazabiliriz.
infix fun Int.carpi(sayi:Int) : Int {
    return this * sayi // this = Int sınıfı
}