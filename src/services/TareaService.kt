package services

import models.Tarea

class TareaService {

    private val archivoService = ArchivoService()

    private val tareas = archivoService.cargarTareas()
}