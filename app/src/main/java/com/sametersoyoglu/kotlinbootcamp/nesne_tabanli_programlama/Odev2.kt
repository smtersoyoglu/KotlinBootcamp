package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

class Odev2 {

    fun soru1 (km: Double) : Double {

        val mileDonusum = km * 0.621
        return mileDonusum

    }

    fun soru2 (kisaKenar: Int, uzunKenar: Int ) {
        val dikdörtgenAlan = kisaKenar * uzunKenar
        println("Dikdörtgenin Alanı: $dikdörtgenAlan")
    }

    fun soru3 (sayi : Int) : Int {
        return if ( sayi <=1) {
            1
        }else {
           sayi * soru3(sayi - 1 )
        }
    }

    fun soru4 (kelime : String) {
        var count = 0

        for (i in kelime) {
            // toLowerCase ile büyük harf olarak girilirse E onu kücük harfe ceviriyoruz e
            if (i.toLowerCase() == 'e') {
                count++
            }
        }
        println("e içerdiği adet $count")
    }

    fun soru5(kenarSayisi: Int) : Double {
        if (kenarSayisi < 3) {
            println("Kenar sayısı 3'ten küçük olamaz.")
        }
        val icAciHesaplama = (kenarSayisi - 2) * 180
        return icAciHesaplama.toDouble() / kenarSayisi
    }

    fun soru6(günSayisi : Int, günBasinaCalismaSaati : Int) : Int {
        val haftalikCalismaSaati = günSayisi * günBasinaCalismaSaati
        val haftalikDüzenliCalismaSaati = if (haftalikCalismaSaati > 150) 150 else haftalikCalismaSaati
        val haftalikFazlaMesaiSaati = if (haftalikCalismaSaati > 150) haftalikCalismaSaati - 150 else 0

        val maasHesabi = haftalikDüzenliCalismaSaati * 40
        val fazlaMesaiMaasHesabi = haftalikFazlaMesaiSaati * 80

        return  maasHesabi + fazlaMesaiMaasHesabi
    }

    fun soru7(otoparkSüresi : Int) : Int{
        val tabanUcret = 50
        val tabanUcretAsimi = 10

        return if (otoparkSüresi <= 1) {
            tabanUcret * otoparkSüresi // 1 saat veya daha azsa, saat başı ücreti uygula
        }else {
            tabanUcret + tabanUcretAsimi * (otoparkSüresi - 1)  // 1 saati aşan her saat için ek ücreti uygula
        }
    }
}