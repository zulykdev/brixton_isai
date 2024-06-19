package com.brixton.gestiontareas.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrackingTaskResponseDTO {
    private int idTask;
    private int porcentProgress;
    private String lastActualization;
}
