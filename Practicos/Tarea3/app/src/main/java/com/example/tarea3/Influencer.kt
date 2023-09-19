package com.example.tarea3

open class Influencer() {
    // Propiedades
    // Red Social, recibe una red por defecto de manera aleatoria
    var redSocial: RedesSociales = RedesSociales.values().random()
    // Cada influencer tiene un id unico
    private val id: Int = (0..999999999).random()

    // Funciones
    fun getId() = "Número de ID de influencer: $id"

    open fun publicar() {
        when (redSocial) {
            RedesSociales.Facebook -> println("Se ha publicado un video nuevo en Facebook.")
            RedesSociales.Instagram -> println("Se ha publicado un video nuevo en Instagram.")
            RedesSociales.Twitter -> println("Se ha publicado un video nuevo en Twitter.")
            RedesSociales.TikTok -> println("Se ha publicado un video nuevo en TikTok.")
            RedesSociales.Twitch -> println("Se ha publicado un video nuevo en Twitch.")
        }
    }
}