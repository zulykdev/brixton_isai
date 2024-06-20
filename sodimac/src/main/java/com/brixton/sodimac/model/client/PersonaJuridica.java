package com.brixton.sodimac.model.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonaJuridica extends Cliente {
    private String ruc;
    private String razonSocial;
}
