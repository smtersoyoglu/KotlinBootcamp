package com.sametersoyoglu.kotlinbootcamp.kalitim

fun main() {
    val topkapiSarayi = Saray(5,300)
    val bogazVilla = Villa(true,20)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarmi)
    println(bogazVilla.pencereSayisi)

    // is ile kontrol yapılır topkapiSarayi Saraydan mı türedi diye kontrol ediyor.
    if (topkapiSarayi is Saray){
        println("Saraydır")
    }else
        println("Saray değildir")

    // Upcasting
    val ev: Ev = bogazVilla

    // Downcasting
    val ev1 = Ev(7)
    val saray = ev1 as Saray
}