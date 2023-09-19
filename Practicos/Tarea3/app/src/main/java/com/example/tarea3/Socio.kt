package com.example.tarea3

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
