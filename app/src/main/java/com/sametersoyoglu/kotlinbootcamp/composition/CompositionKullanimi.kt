package com.sametersoyoglu.kotlinbootcamp.composition

fun main() {
    val k1 = Kategoriler(1,"Dram")
    val k2 = Kategoriler(2,"Bilim Kurgu")

    val y1 = Yonetmenler(1,"Quentin Tarantino")
    val y2 = Yonetmenler(2,"Christopher Nolan")

    // kategoriler ve yonetmenler sınıfına direk erişebiliriz.
    val f1 = Filmler(1,"Django",2013,k1,y1)
    val f2 = Filmler(2,"Inception",2010,k2,y2)

    println("Film id : ${f1.film_id}")
    println("Film ad : ${f1.film_ad}")
    println("Film yil : ${f1.film_yil}")
    println("Film kategori : ${f1.kategoriler.kategori_ad}")
    println("Film yönetmen : ${f1.yonetmenler.yonetmen_ad}")



}