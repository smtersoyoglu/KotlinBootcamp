package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

fun main() {

    val f = Fonksiyonlar()



    // geri dönüş değeri olan return lu fonksiyonlarda önce tanımlarız val gelenToplam = f.toplama() gibi
    val gelenToplam = f.toplama(5,10)
    println("Gelen Toplam: $gelenToplam")


}