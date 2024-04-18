package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Slf4j
public class Cliente {
    private String idCliente;
    private String nombreCliente;
    private  String eMail;
    private List<CarritoDeCompra> historialCompras;
    public Cliente(String idCliente, String nombreCliente, String eMail, List<CarritoDeCompra> compras){
        setIdCliente(idCliente);
        setNombreCliente(nombreCliente);
        setEMail(eMail);
        setHistorialCompras(new ArrayList<>());
    }
    public void mostrarInfoCliente() {
        log.info("ID de cliente: " + getIdCliente());
        log.info("Nombre de cliente: " + getNombreCliente());
        log.info("Correo de cliente: " + getEMail());
        log.info("Mostrar compras de cliente: " + getHistorialCompras());
    }

}
