package com.sametersoyoglu.kotlinbootcamp.collections

fun main() {
    // Tanımlama
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    // Veri ekleme
    meyveler.add("Elma") // 0. index
    meyveler.add("Muz") // 1.index
    meyveler.add("Kiraz") // 2.index
    println(meyveler)

    // Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    // Insert -  ekleme var olan bilgiyi bozmuyor index numarasını kaydırıyor.
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma işlemi - bilgi alma
    println(meyveler[3])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")

    println("Boş kontrol : ${meyveler.isEmpty()}")
    println("İçeriyor mu : ${meyveler.contains("Kiraz")}")

    // var olan sıralamayı terse çevirme reverse()
    meyveler.reverse()
    println(meyveler)

    // sıralama - içeriği String olduğu için harf sırasına göre sıraladı. Int değerlerde değerine göre sıralar.
    meyveler.sort()
    println(meyveler)

    // for döngüsü ile değer alma
    for (meyve in meyveler) {
        println("Sonuç : $meyve")
    }

    // for döngüsü ile değer ve index numarasını alma
    for ((indeks,meyve) in meyveler.withIndex()) {
        println("$indeks. -> $meyve")
    }

    // ArrayList ten veri silme
    meyveler.removeAt(2)
    println(meyveler)

    // tamamını silme
    meyveler.clear()
    println(meyveler)
}