package com.brixtom.democlases.citasmedicas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Slf4j
public class Cita {
    private Medico medico;
    private Paciente paciente;
    private LocalDateTime fechaHora;

    public Cita(Medico medico, Paciente paciente, LocalDateTime fechaHora){
        setMedico(medico);
        setPaciente(paciente);
        setFechaHora(fechaHora);

    }
}
