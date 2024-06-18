package com.brixton.gestiontareas.dto.request;

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
    private UserRequestDTO user;
    private AssignTaskRequestDTO assignTask;
}
