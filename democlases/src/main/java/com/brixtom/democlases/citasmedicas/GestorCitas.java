package com.brixtom.democlases.citasmedicas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Slf4j
public class GestorCitas {
    private List<Cita> citas;

    public GestorCitas(){
        setCitas(new ArrayList<>());
    }
    public void agregarCita(Cita cita) {
        citas.add(cita);
    }
    public List<Cita> getCitasPorPaciente(String pacienteId) {
        List<Cita> citasPaciente = new ArrayList<>();
        for (Cita cita : citas) {
            if (cita.getPaciente().getId().equals(pacienteId)) {
                citasPaciente.add(cita);
            }
        }
        return citasPaciente;
    }
}
