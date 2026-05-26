# Kotlin To-Do CLI

Aplicación de consola desarrollada en Kotlin para gestionar tareas desde terminal.

Permite:
- Agregar tareas
- Listar tareas
- Marcar tareas como completadas
- Eliminar tareas
- Persistencia de datos mediante archivo `.txt`

Proyecto académico orientado al uso de:
- Kotlin
- Programación orientada a objetos
- Persistencia de datos
- Git Flow
- Trabajo colaborativo con ramas

---

# Características
✅ CRUD completo de tareas  
✅ Persistencia local de datos  
✅ Arquitectura por capas  
✅ Interfaz CLI simple  
✅ Uso de ramas Git  
✅ Commits descriptivos  

---

# Estructura del proyecto
```txt
src/
│
├── data/
│   └── tareas.txt
│
├── models/
│   └── Tarea.kt
│
├── services/
│   ├── ArchivoService.kt
│   └── TareaService.kt
│
├── utils/
│   └── Menu.kt
│
└── main.kt
```

---

# Reglas del proyecto
- Trabajar únicamente en ramas
- No hacer push directo a `main`
- Realizar commits descriptivos
- Mantener código limpio y ordenado
- Probar antes de subir cambios
- Hacer Pull Request antes del merge

---

# Requisitos

## 1. Java JDK
Descargar: https://www.oracle.com/java/technologies/downloads/

Verificar instalación:
```bash
java -version
javac -version
```

## 2. Kotlin Compiler
Descargar: https://github.com/JetBrains/kotlin/releases
Agregar Kotlin al PATH del sistema.

Verificar:
```bash
kotlinc -version
```

---

# Clonar y Compilar

```bash
# Clonar
git clone [https://github.com/ManuGale/kotlin-todo-cli.git](https://github.com/ManuGale/kotlin-todo-cli.git)
cd kotlin-todo-cli

# Compilar
kotlinc src -include-runtime -d todo.jar

# Ejecutar
java -jar todo.jar
```

---

# Flujo Git utilizado
Cada integrante trabaja en una rama independiente:

| Integrante | Rama |
|---|---|
| BUENDIA | feature-crud-tareas |
| EMILIO | feature-documentacion-testing |
| GABO | feature-modelo-tarea |
| RAY | feature-persistencia |

---

# Autor
Proyecto realizado con fines académicos.
