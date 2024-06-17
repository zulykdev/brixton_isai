package com.brixton.gestionpedidos.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ClientRequestDTO {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
}
