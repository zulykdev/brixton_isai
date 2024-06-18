package com.brixton.gestiontareas.dto.response;

import com.brixton.gestiontareas.dto.request.AssignTaskRequestDTO;
import com.brixton.gestiontareas.dto.request.NotifyTaskRequestDTO;
import com.brixton.gestiontareas.dto.request.TrackingTaskRequestDTO;
import com.brixton.gestiontareas.dto.request.UserRequestDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TaskResponseDTO {
    private int id;
    private String title;
    private String description;
    private String dateDue;
    private String status;
    private UserRequestDTO user;
    private AssignTaskRequestDTO assignTask;
    private TrackingTaskRequestDTO trackingTask;
    private NotifyTaskRequestDTO notifyTask;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;

}
