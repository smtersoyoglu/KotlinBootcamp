package com.sametersoyoglu.kotlinbootcamp.composition

data class Filmler (var film_id: Int, var film_ad: String, var film_yil: Int,
                    var kategoriler: Kategoriler, var yonetmenler: Yonetmenler )
// kategoriler class ından bir nesne yonetmenler class ından bir nesne isticek kategoriler class ındaki değişkenler ile yonetmenler classındaki değişkenlere bu şekilde erişebiliriz
// veritabanlarında buna foreign key deniyor