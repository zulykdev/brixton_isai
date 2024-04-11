package com.brixtom.democlases.clases;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter //anotaciones
@Setter
public class Boleta {
    private String rucEmisor;
    private String nombreEmpresaEmisor;
    private String nroSerie;
    private String nroBoleta;
    private Client cliente;
    private List<LineaVenta> lineas;
    //calmeCase-> la primera palabra empieza con minuscula y la siguiente en mayuscula
    private double montoTotal;

    public void imprimir(){

    }
    public void apliarIgv(){

    }
    public void calcularSubTotal(){

    }
    public Double getSubTotal(){
        return null;
    }
    public void addProduct(){

    }



}
