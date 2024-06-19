package com.brixton.gestiontareas.dto.generic;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AssignTaskDTO {
    private int idTask;
    private int idUser;
    private String dateAssign;
}
