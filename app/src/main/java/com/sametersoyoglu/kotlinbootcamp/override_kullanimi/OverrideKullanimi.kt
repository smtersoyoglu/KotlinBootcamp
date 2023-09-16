package com.sametersoyoglu.kotlinbootcamp.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val köpek = Köpek()

    hayvan.sesCikar() // Kalıtım yok, kendi sınıfına erişti.
    memeli.sesCikar() // Kalıtım var, üst sınıfın metodunu kullandı.
    kedi.sesCikar() // Kalıtım var, kendi fonksiyonunu kullandı override yardımıyla.
    köpek.sesCikar() // Kalıtım var, kendi metodunu(fonksiyonunu) kullandı override yardımıyla.
}