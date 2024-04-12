package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Pasajero {
    private String nombreCompleto;
    private String nroIdentificacion;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String nroTelefono;
    private String correo;
    private Double millasAcumuladas;

    public void registrarseEnVuelo(Vuelo vueloARegistrar){
        //El pasajero se debe asociar al vuelo.
    }
    public void verificarInformacion(){

    }
    public void cambiarInformacion(){

    }
    public void acumularMillas(){

    }

}
