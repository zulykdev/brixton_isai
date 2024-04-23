package com.brixtom.democlases.citasmedicas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Slf4j
public class HistorialMedico {
    private Paciente paciente;
    private List<String> ingresos;
    private String diagnostico;
    private String tratamiento;

    public HistorialMedico(Paciente paciente){
        setPaciente(paciente);
        setIngresos(new ArrayList<>());
    }
    public void agregarEntrada(String entrada) {
        ingresos.add(entrada);
    }

}
