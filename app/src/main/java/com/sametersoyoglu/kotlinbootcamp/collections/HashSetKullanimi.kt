package com.sametersoyoglu.kotlinbootcamp.collections

fun main() {
    val meyveler = HashSet<String>()

    // HashSet ArrayList te benzer farkı ise  veriler karışıktır. içeriği karıştırır.
    // ArrayList te düzenli HashSet te veriler karışıktır. karıştırma algoritmaları için kullanır.
    // her veriden 1 tane olmasını ister aynı veriden tekrar ekleyemeyiz. yeni veri aktardığımız zaman kendini tekrar düzenler ve yine random olur.

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    // HashSet te veriler düzenli değil karışık gelir.
    println(meyveler)

    meyveler.add("Amasya Elması")
    println(meyveler)

    // istediğimiz index deki veriyi okuma
    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for(m in meyveler) {
        println("Sonuç : $m")
    }

    // index numarası ile veriyi okuma
    for((i,m) in meyveler.withIndex()) {
        println("$i -> $m")
    }

    // SİLME
    meyveler.remove("Elma")
    println(meyveler)


}