package com.brixton.gestionpedidos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Client {
    private int id;
    private String name;
    private String addressClient;
    @JsonIgnore
    private Address address;
    private String phone;
    private String email;
}
