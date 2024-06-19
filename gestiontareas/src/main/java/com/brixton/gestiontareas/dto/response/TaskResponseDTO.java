package com.brixton.gestiontareas.dto.response;

import com.brixton.gestiontareas.dto.generic.AssignTaskDTO;
import com.brixton.gestiontareas.dto.generic.NotifyTaskDTO;
import com.brixton.gestiontareas.dto.request.TrackingTaskRequestDTO;
import com.brixton.gestiontareas.dto.generic.UserDTO;
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
    private UserDTO user;
    private AssignTaskDTO assignTask;
    private TrackingTaskResponseDTO trackingTask;
    private NotifyTaskDTO notifyTask;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;

}
