package com.brixton.gestionusuario.dto.response;

import com.brixton.gestionusuario.dto.request.RolRequestDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
public class UserResponseDTO {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RolRequestDTO rol;
    //private List<String> permission;
    private String createdAt;
    private String createdBy;
    private String UpdatedAt;
    private String updatedBy;
}
