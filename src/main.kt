import services.TareaService
import utils.mostrarMenu

fun main() {

    val tareaService = TareaService()

    var opcion: Int

    println("===================================")
    println("      BIENVENIDO A TO-DO CLI       ")
    println("===================================")

    do {

        mostrarMenu()

        print("\nSelecciona una opción: ")

        opcion = readLine()?.toIntOrNull() ?: -1

        when (opcion) {

            1 -> {

                print("\nIngresa la descripción de la tarea: ")

                val descripcion = readLine()?.trim()

                if (!descripcion.isNullOrEmpty()) {

                    tareaService.agregarTarea(descripcion)

                } else {

                    println(" La descripción no puede estar vacía")
                }
            }

            2 -> {

                tareaService.listarTareas()
            }

            3 -> {

                print("\nIngresa el ID de la tarea completada: ")

                val id = readLine()?.toIntOrNull()

                id?.let {

                    tareaService.completarTarea(it)

                } ?: println("ID inválido")
            }

            4 -> {

                print("\nIngresa el ID de la tarea a eliminar: ")

                val id = readLine()?.toIntOrNull()

                id?.let {

                    tareaService.eliminarTarea(it)

                } ?: println("ID inválido")
            }

            5 -> {

                println("\n Cerrando aplicación...")
            }

            else -> {

                println("Opción inválida")
            }
        }

    } while (opcion != 5)
}