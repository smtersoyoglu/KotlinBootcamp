package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

class Fonksiyonlar {

    // void - geri dönüş değeri olmayan
    fun selamla1() {
        val sonuc = "Merhaba Samet"
        println(sonuc)
    }



    // return- geri dönüş değeri olan fonksiyon
    fun toplama(sayi1: Int, sayi2: Int) : Int{
        val toplam = sayi1 + sayi2
        return toplam
    }

    // parametre
    fun selamla3 (isim: String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    // Overloading bir sınıfta bir dosya içerisinde aynı isimli fonksiyon oluşturamazsın
    // Overloading kullanarak aynı isimli fonksiyon yapabiliriz tek şart parametrelerin sıralaması farklı olması veya yeni bir parametre ekleyerek yapabiliriz.
    fun carp(sayi1:Int, sayi2: Int) {
        println("Çarpma : ${sayi1*sayi2}")
    }
    // ikisinin de isimleri aynı ama parametre tipleri farklı olduğu için hata almıyoruz buna overloading deniyor ya yeni bir parametre ekleriz ya da dönüş tiplerini değiştirerek hata almayız.
    fun carp(sayi1:Double, sayi2: Int) {
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1:Int, sayi2: Int, isim:String) {
        println("Çarpma : ${sayi1*sayi2} - İşlem yapan: $isim")
    }

}