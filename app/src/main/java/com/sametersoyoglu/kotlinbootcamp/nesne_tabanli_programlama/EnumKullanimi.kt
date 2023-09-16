package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

fun main() {

    ucretHesapla(124,KonserveBoyut.ORTA)
}

// Enumeration programcının işlerini kolaylaştıran yapılardır örneğin Color da varsayılan olarak programın verdiği renkler gibi altta konserve boyutları ile kolayca yapmak gibi

fun ucretHesapla(adet:Int, boyut: KonserveBoyut) {
    when(boyut) {
        KonserveBoyut.KUCUK -> println("Toplam Maliyet : ${adet * 30} TL ")
        KonserveBoyut.ORTA -> println("Toplam Maliyet : ${adet * 40} TL ")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet : ${adet * 50} TL ")

    }
}