package com.brixtom.democlases.citasmedicas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Paciente {
    private String id;
    private String nombre;
    private String telefono;

    public Paciente(String id, String nombre, String telefono){
        setId(id);
        setNombre(nombre);
        setTelefono(telefono);
    }

}
