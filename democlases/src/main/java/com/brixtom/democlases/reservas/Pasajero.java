package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class Pasajero {
    private String nombreCompleto;
    private TipoDocumento identificacion;
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

// Clase Pasajero 
// 1 Pasajero puede estar/tener 1 ... o muchos ..... ? 
// 

