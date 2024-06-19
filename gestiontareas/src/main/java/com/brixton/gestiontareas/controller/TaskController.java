package com.brixton.gestiontareas.controller;

import com.brixton.gestiontareas.dto.request.TaskRequestDTO;
import com.brixton.gestiontareas.dto.request.TrackingTaskRequestDTO;
import com.brixton.gestiontareas.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/v1/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @PostMapping
    public ResponseEntity<Object> newTask(@RequestBody TaskRequestDTO input){
        return ResponseEntity.ok(taskService.newTask(input));
        //return null;
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<Object> getTask(@PathVariable int taskId){
        Object newTask = taskService.getTask(taskId);
        if (newTask != null) {
            return ResponseEntity.ok(newTask);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{taskId}/progress")
    public ResponseEntity<Object> updateTrackingTask(@PathVariable int taskId, @RequestBody TaskRequestDTO taskActualizar) {
        return ResponseEntity.ok(taskService.updateTrackingTask(taskId, taskActualizar));

    }
    @GetMapping("/{taskId}/assignee")
    public ResponseEntity<Object> getUser(@PathVariable int taskId){
        Object newTask = taskService.getTask(taskId);
        if (newTask != null) {
            return ResponseEntity.ok(newTask);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
