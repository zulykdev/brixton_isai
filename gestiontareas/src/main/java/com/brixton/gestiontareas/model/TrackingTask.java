package com.brixton.gestiontareas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class TrackingTask {
    private int idTask;
    //private StatusTracking status;
    private int porcentProgress;
    private LocalDate lastActualization;
}
