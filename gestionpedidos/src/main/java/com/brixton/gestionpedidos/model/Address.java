package com.brixton.gestionpedidos.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
    private String nameStreet;
    private String numberHouse;
    private String provincia;
    private String departamento;
    private String pais;
    private String codigoPostal;
}
