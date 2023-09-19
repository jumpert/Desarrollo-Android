# Codigo de Tarea 3 Kotlin

## Main, TipoVideo, RedesSociales

```kotlin 

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

```

## Clase YouTuber

```kotlin

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

```
## Clase Video

```kotlin

// Video con nombre, duracion y tipo, el tipo es un enum de TipoVideo
class Video(nombre: String, duracion: Int, tipo: TipoVideo)

```

## Clase Influencer

```kotlin

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

```

# Parte 2

## Clase Socio

```kotlin

data class Socio(val nombre: String, val numeroSocio: Int,var  categoria: Categoria): Entrenar {
    // la funcion equals solo debe verificar el nombre y el numeroSocio en funcion flecha
    override fun equals(other: Any?): Boolean {
        return if (other is Socio) {
            this.nombre == other.nombre && this.numeroSocio == other.numeroSocio
        } else {
            false
        }
    }

    override fun correr() {
        if (categoria == Categoria.JUBILADO)
            println("Quién me mandó salir a correr.")
        else
            super.correr()
    }

}

```

## Enum Class Categoria

```kotlin

enum class Categoria {
    ADULTO,
    JOVEN,
    JUBILADO
}

```

## Interface Entrenar

```kotlin

interface Entrenar {
    fun correr() {
        println("Voy a correr.")
    }
    fun caminar() {
        println("Arranco a caminar.")
    }
    fun nadar() {
        println("A darse un chapuzón.")
    }
}

```

