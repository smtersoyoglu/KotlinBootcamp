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

    // Sort - Sıralama ( sıralama,listeleme işlemlerinde kullanırız genelde - fiyatına göre sırala gibi işlemler)
    println("Sayısal : Küçükten > Büyüğe") // no ya göre kücükten büyüğe doğru sıralar
    val siralama1 = ogrencilerListesi.sortedWith(compareBy { it.no }) // ASC : ascend sıralama denir.
    for (ogrenci in siralama1) {
        println("No : ${ogrenci.no} - Ad : ${ogrenci.ad} - Sınıf : ${ogrenci.sinif}")
    }

    println("Sayısal : Büyükten > Küçüğe") // no ya göre büyükten kücüğe doğru sıralar
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending { it.no }) // DESC : descend sıralama denir.
    for (ogrenci in siralama2) {
        println("No : ${ogrenci.no} - Ad : ${ogrenci.ad} - Sınıf : ${ogrenci.sinif}")
    }

    println("Metinsel : Küçükten > Büyüğe") // ad a göre (harfe göre) kücükten büyüğe doğru sıralar
    val siralama3 = ogrencilerListesi.sortedWith(compareBy { it.ad }) // ASC : ascend sıralama denir.
    for (ogrenci in siralama3) {
        println("No : ${ogrenci.no} - Ad : ${ogrenci.ad} - Sınıf : ${ogrenci.sinif}")
    }

    println("Metinsel : Küçükten > Büyüğe") // ad a göre (harfe göre) kücükten büyüğe doğru sıralar
    val siralama4 = ogrencilerListesi.sortedWith(compareByDescending { it.ad }) // DESC : descend  sıralama denir.
    for (ogrenci in siralama4) {
        println("No : ${ogrenci.no} - Ad : ${ogrenci.ad} - Sınıf : ${ogrenci.sinif}")
    }

    //  Filtreleme işlemleri - örneğin fiyatı 50tl den küçükleri getir gibi işlemlerimizde kullanırız. arama işlemini (search) de filtreleme ile yapabiliriz.
    println("Filtreleme 1")
    val filtreleme1 = ogrencilerListesi.filter {
        it.no > 150 // no su 150 den büyük olanları getir demek. buna göre filtrele demek.
    }
    for (ogrenci in filtreleme1) {
        println("No : ${ogrenci.no} - Ad : ${ogrenci.ad} - Sınıf : ${ogrenci.sinif}")
    }

    println("Filtreleme 2")
    val filtreleme2 = ogrencilerListesi.filter {
        it.ad.contains("yz")  // contains() içeriğini kontrol et demek içerisine ne yazarsak ona göre getirir. örneğin yz yazdık yz içerenleri getir demek.
    }
    for (ogrenci in filtreleme2) {
        println("No : ${ogrenci.no} - Ad : ${ogrenci.ad} - Sınıf : ${ogrenci.sinif}")
    }


}