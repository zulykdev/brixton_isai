package com.brixton.gestionpedidos.model.mappers;

import com.brixton.gestionpedidos.model.Address;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddressMapper {
    public static Address mapAddressDTOToAddress(String addressInput) {
        String[] partesDireccion = addressInput.split(",");//ejemplo de ingreso: Jr. Amazonas,465,Huancayo,Junin,Perú,51064
        String calle = partesDireccion[0].trim();
        String numero = partesDireccion[1].trim(); //int numero = Integer.parseInt(partesDireccion[1].trim());
        String provincia = partesDireccion[2].trim();
        String departamento = partesDireccion[3].trim();
        String pais = partesDireccion[4].trim();
        String codigoPostal = partesDireccion[5].trim();

        Address address = new Address();
        address.setNameStreet(calle);
        address.setNumberHouse(numero);
        address.setProvincia(provincia);
        address.setDepartamento(departamento);
        address.setPais(pais);
        address.setCodigoPostal(codigoPostal);

        return address;
    }

    public static String mapAddressToAddressDTO(Address addressInput){
        String address = addressInput.getNameStreet() + "," + addressInput.getNumberHouse() + "," + addressInput.getProvincia() + "," + addressInput.getPais() + "," + addressInput.getCodigoPostal();
        return address;
    }



}
