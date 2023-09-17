package com.sametersoyoglu.kotlinbootcamp.collections

fun main() {
    // HashMap Key Value ilişkisi vardır. ArrayList in bizim tarafından düzenlenmiş hali diye düşünebiliriz.
    // ArrayList te index numarası 0 1 2 3 .. gibi gittiği için HashMap te index yani Key numarasını biz kendimiz ayarlıyabiliriz.
    // Web servisli işlemlerde veri gönderme işlemlerinde kullandığımız bir yapıdır.
    // genelde Firebase de kullanırız. Sistem bizden istediği zaman kullanılan bir yapıdır.

    val iller = HashMap<Int,String>()
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller.put(60,"Tokat")
    iller[6] = "Ankara" // bu şekilde de yapılabilir
    println(iller)

    // Okuma işlemi
    println(iller.get(16))

    // Güncelleme işlemi
    iller.put(16,"Yeni Bursa")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    for ((anahtar,deger) in iller) {
        println("$anahtar -> $deger")
    }

    // Silme
    iller.remove(34)
    println(iller)

}