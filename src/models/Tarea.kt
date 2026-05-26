package models

data class Tarea(
    var id: Int,
    var titulo: String,
    var descripcion: String,
    var completada: Boolean = false
) { 

    fun marcarCompletada() {
        completada = true
    }

    override fun toString(): String {
       
    }
}