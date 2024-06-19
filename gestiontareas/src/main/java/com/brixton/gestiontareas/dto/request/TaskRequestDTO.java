package com.brixton.gestiontareas.dto.request;

import com.brixton.gestiontareas.dto.generic.AssignTaskDTO;
import com.brixton.gestiontareas.dto.generic.UserDTO;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TaskRequestDTO {
    private int id;
    private String title;
    private String description;
    private String dateDue;
    private String status;
    private UserDTO user;
    private AssignTaskDTO assignTask;
}
