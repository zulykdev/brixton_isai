package com.brixtom.democlases.agenciaviajes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cliente {
    private String id;
    private String nombre;
    private String email;
    private String telefono;

    public Cliente(String id, String nombre, String email, String telefono){
        setId(id);
        setNombre(nombre);
        setEmail(email);
        setTelefono(telefono);
    }

}
