package com.brixton.gestiontareas.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TrackingTaskRequestDTO {
    private int idTask;
    //private String status;
    private int porcentProgress;
    private String lastActualization;
}
