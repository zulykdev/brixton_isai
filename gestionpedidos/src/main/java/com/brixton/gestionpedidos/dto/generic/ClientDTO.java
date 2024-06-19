package com.brixton.gestionpedidos.dto.generic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ClientDTO {
    private int id;
    private String name;
    private String addressClient;
    private String phone;
    private String email;
}
