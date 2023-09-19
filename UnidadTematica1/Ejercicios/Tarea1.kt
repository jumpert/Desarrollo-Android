fun main() {
    //ejercicio1
    val personas = mutableMapOf<String, Int>()
    personas.put("Jorge Perez", 26)
    personas.put("Alberto Rodriguez", 30)
    personas.put("Jorge Peres", 42)
    personas.put("Tómas Lorenzo", 12)
    personas.put("Alejandra Romero", 29)
    personas.put("Juan Gonzalez", 68)
    personas.put("Alberto Trochon", 17)
    personas.put("Juana Batista", 34)
    //parte a)
    println("Entre 28 y 42:")
    for (item in personas){
        if (item.value in 28..42){
            println(item.key)
        }
    }

    //parte b)
    println("\n Mayores 42: ")
    for (item in personas){
        if (item.value > 42){
            println(item.key)
        }
    }

    //parte c)
    println("\nNombres ordenados:")
    var nombresOrdenados = personas.toSortedMap(compareBy<String> { it.length }.thenBy { it })
    for (item in nombresOrdenados.keys){
        println(item)
    }

}