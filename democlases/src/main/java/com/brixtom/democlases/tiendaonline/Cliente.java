package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString
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

}
