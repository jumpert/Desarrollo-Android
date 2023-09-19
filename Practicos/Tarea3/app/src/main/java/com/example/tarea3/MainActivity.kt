package com.example.tarea3

fun main() {
    val videos = mutableListOf<Video>()
    val video1 = Video("Video1", 10, TipoVideo.ShortVideo)
    val video2 = Video("Video2", 20, TipoVideo.LongVideo)
    val video3 = Video("Video3", 30, TipoVideo.ShortVideo)
    val video4 = Video("Video4", 40, TipoVideo.LongVideo)
    val video5 = Video("Video5", 50, TipoVideo.ShortVideo)
    val video6 = Video("Video6", 60, TipoVideo.LongVideo)
    val video7 = Video("Video7", 70, TipoVideo.ShortVideo)
    val video8 = Video("Video8", 80, TipoVideo.LongVideo)
    val video9 = Video("Video9", 90, TipoVideo.ShortVideo)
    val video10 = Video("Video10", 100, TipoVideo.LongVideo)
    videos.add(video1)
    videos.add(video2)
    videos.add(video3)
    videos.add(video4)
    videos.add(video5)
    videos.add(video6)
    videos.add(video7)
    videos.add(video8)
    videos.add(video9)
    videos.add(video10)

    val fofo = YouTuber("Fofito", 10000, videos)
    fofo.imprimirPresentacion()
    fofo.publicar()
    println(fofo.getId())
    println(fofo.esFamoso)

    val jumpert = Influencer()
    jumpert.publicar()
    print(jumpert.getId())

    println("\n-----------------------------\n")
    println("Parte 2")
    // Se crea usuario Juan y una copia Pedro
    val juan = Socio("Juan", 1, Categoria.ADULTO)
    val pedro = juan.copy()
    // Se verifica que sean iguales
    println(juan.equals(pedro))
    // Se cambia la categoria de Pedro y se verifica que el equals siga funcionando
    pedro.categoria = Categoria.JUBILADO
    println(juan.equals(pedro))
    // Probando interfaz Entrenar
    juan.correr()
    pedro.correr()


}

// Tipo de video, segun la letra es corto o largo
enum class TipoVideo{
    ShortVideo,
    LongVideo
}

enum class RedesSociales {
    Facebook,
    Instagram,
    Twitter,
    TikTok,
    Twitch
}


