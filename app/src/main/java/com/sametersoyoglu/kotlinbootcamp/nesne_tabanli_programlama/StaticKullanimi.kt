package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

fun main() {

    val a = ASinifi()
    //println(a.x)

    //a.metod()

    // Virtual Object - Sanal Nesne -İismsiz nesne
    //println(ASinifi().x)
    //ASinifi().metod()

    // yukarıdaki sanal nesne parantez var parantez olmazsa static anlamına geliyor. yani componion object kullandığımız anlamına geliyor.
    // performans olarak static daha verimlidir o yüzden componion object sık kullanırız retrofit te felan.
    println(ASinifi.x)
    ASinifi.metod()


}