package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

fun main() {

    val f = Fonksiyonlar()

    // void - geri dönüş değeri olmayan fonksiyonu çağırma direk yapılır.
    f.selamla1()

    // geri dönüş değeri olan return lu fonksiyonlarda önce tanımlarız val gelenToplam = f.toplama() gibi
    val gelenToplam = f.toplama(5,10)
    println("Gelen Toplam: $gelenToplam")

    // parametre kullanımı return lu ise val kullanarak tanımlayarak - void ise direk

    f.selamla3("Ahmet")

    // Overloading li fonksiyonları çağırma
    f.carp(2,10)
    f.carp(4,7,"Samet")

}