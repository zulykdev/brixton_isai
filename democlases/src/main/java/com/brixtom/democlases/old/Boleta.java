package com.brixtom.democlases.old;

import ch.qos.logback.core.net.server.Client;
import com.brixtom.democlases.clases.LineaVenta;

import java.util.List;
//el nombre de la clase inicia en mayuscula
public class Boleta {

    //Atributos de la clase
    //acceso, tipo de dato, la variable y asignación si deseas
    //son sustantivos en singular
    /**
     * public cualquiera puede utlizar estos metodos
     * private solo puede ser utilizado por la clase
     * protected solo puede ser utilizado por la clase o superclase
     * package solo puede ser utilizado por el paquete (por defecto)
     */
    //private String rucEmisor; <- acceso paquete
    private String rucEmisor;
    private String nombreEmpresaEmisor;
    private String nroSerie;
    private String nroBoleta;
    private Client cliente;
    private List<LineaVenta> lineas;
    //calmeCase-> la primera palabra empieza con minuscula y la siguiente en mayuscula
    private double montoTotal;
    // en la definicion de los metodos tambien aplicamos el camelCase
    //SET
    public void setRucEmisor(String aRucEmisor){
        rucEmisor= aRucEmisor;
    }
    public void setNombreEmpresaEmisor(String aNombreEmpresaEmisor){
        nombreEmpresaEmisor=aNombreEmpresaEmisor;
    }
    public void setNroSerie(String aNroSerie){
        nroSerie=aNroSerie;
    }
    public void setNroBoleta(String aNroBoleta){
        nroBoleta=aNroBoleta;
    }

    public String getRucEmisor() {
        return rucEmisor;
    }

    public String getNombreEmpresaEmisor() {
        return nombreEmpresaEmisor;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public String getNroBoleta() {
        return nroBoleta;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public List<LineaVenta> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaVenta> lineas) {
        this.lineas = lineas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

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
