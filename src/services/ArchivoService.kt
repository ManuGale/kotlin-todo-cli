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

    fun cargarTareas(): MutableList<Tarea> {

        val tareas = mutableListOf<Tarea>()

        if (!archivo.exists()) {
            archivo.createNewFile()
        }

        archivo.forEachLine { linea ->

            val datos = linea.split(",")

            if (datos.size == 4) {

                tareas.add(
                    Tarea(
                        datos[0].toInt(),
                        datos[1],
                        datos[2],
                        datos[3].toBoolean()
                    )
                )
            }
        }

        return tareas
    }
}
