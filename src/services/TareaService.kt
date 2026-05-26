package services

import models.Tarea

class TareaService {

    private val archivoService = ArchivoService()

    private val tareas = archivoService.cargarTareas()

    fun agregarTarea(titulo: String, descripcion: String) {

        val nuevoId =
            if (tareas.isEmpty()) 1
            else tareas.maxOf { it.id } + 1

        val tarea = Tarea(
            nuevoId,
            titulo,
            descripcion
        )

        tareas.add(tarea)

        archivoService.guardarTareas(tareas)

        println("Tarea agregada correctamente")
    }
}