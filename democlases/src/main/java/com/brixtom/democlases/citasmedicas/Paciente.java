package com.brixtom.democlases.citasmedicas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Getter
@Setter
@Slf4j
public class Paciente {
    private String id;
    private String tipoDocumento;// hacer una clase documento
    private String numDocumento;// hacer una clase documento
    private String nombre;
    private String telefono;
    private boolean asegurado;
    private LocalDate fechaNacimiento;
    private Double peso;
    private Double talla;
    private Double presion;
    private String grupoSanguineo;

    public Paciente(String id, String nombre, String numDocumento, boolean asegurado, String telefono){
        setId(id);
        setNombre(nombre);
        setNumDocumento(numDocumento);
        setTelefono(telefono);
        setAsegurado(asegurado);
    }

}
