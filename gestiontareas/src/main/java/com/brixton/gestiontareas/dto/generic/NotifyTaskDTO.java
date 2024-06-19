package com.brixton.gestiontareas.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NotifyTaskRequestDTO {
    private int id;
    private String type;
    private String message;
    private String DateNotify;
}
