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

    fun listarTareas() {

        if (tareas.isEmpty()) {
            println("No hay tareas registradas")
            return
        }

        tareas.forEach {
            println(it)
            println("-------------------")
        }
    }

    fun completarTarea(id: Int) {

        val tarea = tareas.find { it.id == id }

        if (tarea != null) {

            tarea.marcarCompletada()

            archivoService.guardarTareas(tareas)

            println("Tarea completada")
        } else {
            println("Tarea no encontrada")
        }
    }
}