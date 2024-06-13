package com.brixton.gestionusuario.service;

import com.brixton.gestionusuario.dto.request.UserRequestDTO;

import java.util.List;

public interface UserService {
    Object createUser(UserRequestDTO userForCreate);
    Object getUser(int idUser);
    Object updateUser(int idUSer, UserRequestDTO userForUpdate);
    List<String> getRolOfUser(int idUser);
    Object getPermissionsOfUser (int idUser);

}
