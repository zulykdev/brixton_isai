package com.brixtom.democlases.gestionempleados;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Nomina {

    private Map<Double, Empleado> pagos;

    public Nomina(){
        setPagos(new HashMap<>());
    }
    public void agregarPago(Empleado empleado, double monto) {

    }

    public double getPago(Empleado empleado) {

        return 0;
    }
}
