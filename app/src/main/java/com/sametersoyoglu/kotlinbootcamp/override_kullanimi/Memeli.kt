package com.sametersoyoglu.kotlinbootcamp.override_kullanimi

open class Memeli : Hayvan() {
    override fun sesCikar() {
        super.sesCikar()
    }
    // super : Üst sınıfı temsil eder. (Hayvan class ını temsil ediyor burda.)
    // this : Bulunduğu sınıfı temsil eder. (Memeli sınıfı temsil eder burda)
}