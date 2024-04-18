package com.brixtom.democlases.agenciaviajes;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Slf4j
public class Agencia {
    private List<Cliente> clientes;
    private List<Destino> destinos;
    private List<PaqueteTuristico> paquetes;
    private List<Reserva> reservas;

    public Agencia(){
        setClientes(new ArrayList<>());
        setDestinos(new ArrayList<>());
        setPaquetes(new ArrayList<>());
        setReservas(new ArrayList<>());
    }
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void agregarDestino(Destino destino) {
        destinos.add(destino);
    }
    public void agregarPaquete(PaqueteTuristico paquete) {
        paquetes.add(paquete);
    }
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
}
