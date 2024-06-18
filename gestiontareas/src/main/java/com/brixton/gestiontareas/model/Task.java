package com.brixton.gestiontareas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Task extends ObjectAudit{
    private int id;
    private String title;
    private String description;
    private LocalDate dateDue;
    private StatusTask status;
    private User user;
    private AssignTask assignTask;
    private TrackingTask trackingTask;
    private NotifyTask notifyTask;
}
