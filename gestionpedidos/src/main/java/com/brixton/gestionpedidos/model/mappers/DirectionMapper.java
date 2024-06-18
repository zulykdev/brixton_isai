package com.brixton.gestionpedidos.model.mappers;

import com.brixton.gestionpedidos.dto.generic.ClientDTO;
import com.brixton.gestionpedidos.model.Address;

public class DirectionMapper {
    public Address mappDireccionDTOToDireccion(ClientDTO client) {
        String[] partesDireccion = client.getAddress().split(",");

        String calle = partesDireccion[0].trim();
        String numero = partesDireccion[1].trim();
        //int numero = Integer.parseInt(partesDireccion[1].trim());
        String provincia = partesDireccion[2].trim();
        String departamento = partesDireccion[3].trim();
        String pais = partesDireccion[4].trim();
        String codigoPostal = partesDireccion[5].trim();

        Address direction = new Address();
        direction.setNameStreet(calle);
        direction.setNumberHouse(numero);
        direction.setProvincia(provincia);
        direction.setDepartamento(departamento);
        direction.setPais(pais);
        direction.setCodigoPostal(codigoPostal);

        return direction;
    }
}
