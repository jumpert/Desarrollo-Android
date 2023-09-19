package com.example.tarea3

//Propiedades: nombre (String), seguidores (Int), videos (lista de Videos)
class YouTuber(val nombre: String, val seguidores: Int, val videos: List<Video>) : Influencer() {
    //esFamoso es una propiedad que devuelve un String, si el numero de seguidores es mayor a 5000 devuelve "Es famoso", si no devuelve "No es famoso"
    val esFamoso: String = if (seguidores > 5000) "Es famoso" else "No es famoso"
    fun imprimirPresentacion() {
        println("Hola soy $nombre. Tengo $seguidores seguidores gracias a los ${videos.size} videos que he subido.")
    }

    override fun publicar() {
        println("Se ha publicado un video nuevo en YouTube.")
    }
}