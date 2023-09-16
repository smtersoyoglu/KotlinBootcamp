package com.sametersoyoglu.kotlinbootcamp.nesne_tabanli_programlama

class ASinifi {

    // static olmasını istediğimiz yapıları componion object içerisine alırız.
    // bu sayede sınıf ismiyle hem x hemde metod a erişebiliriz.
    companion object {
        var x = 10
        fun metod() {
            println("Metod çalıştı")
        }
    }

}