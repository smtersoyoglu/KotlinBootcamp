package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

fun main() {

    val o2 = Odev2()
    //soru1
    val sonuc1 = o2.soru1(70.0)
    println(sonuc1)

    // soru2
    o2.soru2(10,20)

    // soru3

    val foktoriyelHesaplama = o2.soru3(5)
    println("Faktoriyel değeri : $foktoriyelHesaplama")

    // soru4
    o2.soru4("MERHABA SENİN KELİME")

    // soru5 - kenar sayısına göre ic acı hesaplama
    val icAciHesap = o2.soru5(4)
    println("Her bir iç açı: $icAciHesap derece")

    // soru6 - Gün sayısına ve çalışma saatlerine göre maaş hesaplama
    val maasHesabi = o2.soru6(20,8)
    println("Toplam maaş: $maasHesabi Tl")

    // soru7 otopark süresine göre otopark ücreti hesaplama
    val otoparkUcreti = o2.soru7(4)
    println("Otopark Ücreti : $otoparkUcreti")
}