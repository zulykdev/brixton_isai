package com.brixton.gestiontareas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class AssignTask {
    private int idTask;
    private int idUser;
    private LocalDate dateAssign;
}
