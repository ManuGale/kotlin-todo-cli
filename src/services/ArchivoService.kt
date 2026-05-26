package services

import models.Tarea
import java.io.File

class ArchivoService {

    private val archivo = File("src/data/tareas.txt")

    fun guardarTareas(tareas: List<Tarea>) {

        archivo.printWriter().use { out ->

            tareas.forEach { tarea ->

                out.println(
                    "${tarea.id}," +
                    "${tarea.titulo}," +
                    "${tarea.descripcion}," +
                    "${tarea.completada}"
                )
            }
        }
    }
}
