package com.brixton.gestionpedidos.dto.generic;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ClientDTO {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
}
