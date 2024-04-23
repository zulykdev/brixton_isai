package com.brixtom.democlases.gestionempleados;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Empleado {
    private String id;
    private String nombre;
    private String email;
    private Departamento departamento;
    private double salarioBase;
    private Empleado jefeDirecto;


    public Empleado(String id, String nombre, String email, Departamento departamento, double salarioBase){
        setId(id);
        setNombre(nombre);
        setEmail(email);
        setDepartamento(departamento);
        setSalarioBase(salarioBase);
    }

}
