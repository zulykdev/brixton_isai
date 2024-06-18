package com.brixton.gestiontareas.service;

import com.brixton.gestiontareas.dto.request.TaskRequestDTO;


public interface TaskService {
    /**
     * api/tasks (POST):  Asignar una nueva tarea a un usuario específico.
      /api/tasks/{id} (GeT): Obtener detalles de una tarea, incluyendo asignación y progreso.
      /api/tasks/{id}/progress (PUT):  Actualizar el progreso de una tarea.
      /api/tasks/{id}/assignee (GET): Obtener el usuario asignado a una tarea.
     */

    Object newTask(TaskRequestDTO newTask);
    Object getTask(int idTask);
    Object updateTrackingTask(int idTask, TaskRequestDTO taskToUpdate);
    Object getUser(int idTask);

}
