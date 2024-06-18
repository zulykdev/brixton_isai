package com.brixton.input.service;

import com.brixton.input.dto.request.UserRequestDTO;

import java.util.List;

public interface UserService {
    Object createUser(UserRequestDTO inputUser);
    List<Object> createWithList(List<UserRequestDTO> users);
    Object updateUser(String username, UserRequestDTO userActualizar);
    Object getUsername(String username);
    Object deleteUser(String username);
    Object login(String username, String password);
    Boolean logout(String username);
}
