package com.brixtom.democlases.citasmedicas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Medico {
    private String id;
    private String nombre;
    private String especialidad;

    public Medico(String id, String nombre, String especialidad){
        setId(id);
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

}
