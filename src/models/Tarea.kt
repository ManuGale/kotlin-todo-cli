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
        return """
            ID: $id
            Titulo: $titulo
            Descripcion: $descripcion
            Estado: ${if (completada) "Completada" else "Pendiente"}
        """.trimIndent()
    }
}