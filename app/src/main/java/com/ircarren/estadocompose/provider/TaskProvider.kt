package com.ircarren.estadocompose.provider

import com.ircarren.estadocompose.model.Task

class TaskProvider {
    companion object{
        var tareas = mutableListOf<Task>(
            Task(0,"Tarea 1", "Descripcion 1", false),
            Task(1,"Tarea 2", "Descripcion 2", false),
            Task(2,"Tarea 3", "Descripcion 3", true),
            Task(3,"Tarea 4", "Descripcion 4", false),
            Task(4,"Tarea 5", "Descripcion 5", true),
            Task(5,"Tarea 6", "Descripcion 6", false),
            Task(6,"Tarea 7", "Descripcion 7", false),
            Task(7,"Tarea 8", "Descripcion 8", true),
            Task(8,"Tarea 9", "Descripcion 9", false),
            Task(9,"Tarea 10", "Descripcion 10", false),
            Task(10,"Tarea 11", "Descripcion 11", false),
            Task(11,"Tarea 12", "Descripcion 12", true),
            Task(12,"Tarea 13", "Descripcion 13", true),
            Task(13,"Tarea 14", "Descripcion 14", false),
            Task(14,"Tarea 15", "Descripcion 15", false),
            Task(15,"Tarea 16", "Descripcion 16", true),
            Task(16,"Tarea 17", "Descripcion 17", false),
            Task(17,"Tarea 18", "Descripcion 18", false),
            Task(18,"Tarea 19", "Descripcion 19", false),
            Task(19,"Tarea 20", "Descripcion 20", true),
            Task(20,"Tarea 21", "Descripcion 21", true),
        )
        var aux = mutableListOf<Task>()

    }
}