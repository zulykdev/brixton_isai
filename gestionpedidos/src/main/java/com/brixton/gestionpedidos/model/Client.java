package com.brixton.gestionpedidos.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Client {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
}
