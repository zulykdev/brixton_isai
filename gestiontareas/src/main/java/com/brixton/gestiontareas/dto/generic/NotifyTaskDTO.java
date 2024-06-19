package com.brixton.gestiontareas.dto.generic;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NotifyTaskDTO {
    private int id;
    private String type;
    private String message;
    private String DateNotify;
}
