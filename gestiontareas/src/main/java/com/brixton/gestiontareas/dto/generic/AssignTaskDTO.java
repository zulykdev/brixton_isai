package com.brixton.gestiontareas.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AssignTaskRequestDTO {
    private int idTask;
    private int idUser;
    private String dateAssign;
}
