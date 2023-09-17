package com.sametersoyoglu.kotlinbootcamp.collections

fun main() {
    val o1 = Ogrenciler(200,"Zeynep","9C")
    val o2 = Ogrenciler(300,"Ahmet","10A")
    val o3 = Ogrenciler(100,"Beyza","11B")

    val ogrencilerListesi = ArrayList<Ogrenciler>()

    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (ogrenci in ogrencilerListesi) {
        println("No : ${ogrenci.no} - Ad : ${ogrenci.ad} - Sınıf : ${ogrenci.sinif}")

    }

}