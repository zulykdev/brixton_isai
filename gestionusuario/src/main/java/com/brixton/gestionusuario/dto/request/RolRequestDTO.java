package com.brixton.gestionusuario.dto.request;

import lombok.Getter;
import lombok.ToString;

import java.util.List;
@Getter
@ToString
public class RolRequestDTO {
    int id;
    String nameRol;
    List<String> permissions;
}
