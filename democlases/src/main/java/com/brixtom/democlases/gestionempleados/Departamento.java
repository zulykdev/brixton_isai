package com.brixtom.democlases.gestionempleados;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Departamento {
    private String id;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String id, String nombre){
        setId(id);
        setNombre(nombre);
        setEmpleados(new ArrayList<>());
    }
}
