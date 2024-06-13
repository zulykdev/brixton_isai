package com.brixton.gestionusuario.service;

import com.brixton.gestionusuario.dto.request.UserRequestDTO;
import com.brixton.gestionusuario.dto.response.UserResponseDTO;
import com.brixton.gestionusuario.model.PermissionType;
import com.brixton.gestionusuario.model.User;
import com.brixton.gestionusuario.model.mappers.CustomDateDeserializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserServiceImpl implements UserService{
    private static final String USER_APP = "ADMIN";
    Map<Integer, User> users = new HashMap<>();
    Map<String, String> userLoggeds= new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();

    public UserServiceImpl() {
        module.addDeserializer(LocalDate.class, new CustomDateDeserializer());
        module.addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
            @Override
            public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString(value.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        });
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(module);
        objectMapper.findAndRegisterModules();
    }

    @Override
    public Object createUser(UserRequestDTO userForCreate) {
        try {
            String jsonInput = objectMapper.writeValueAsString(userForCreate);

            User user = objectMapper.readValue(jsonInput, User.class);
            user.setCreatedAt(LocalDateTime.now());
            user.setCreatedBy(USER_APP);
            users.put(user.getId(), user);
            //log.info("datos ingresados: "+ user);
            String jsonOutput = objectMapper.writeValueAsString(user);
            UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
            return output;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getUser(int idUser) {
        User userFound = users.get(idUser);
        try {
            String jsonOutput = objectMapper.writeValueAsString(userFound);
            UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
            return output;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object updateUser(int idUser, UserRequestDTO userForUpdate) {
        try {
            String jsonInput = objectMapper.writeValueAsString(userForUpdate);
            User userTemporal = objectMapper.readValue(jsonInput, User.class);

            User original = users.get(idUser);
            if(original != null){
                original.setUserName(userTemporal.getUserName());
                original.setFirstName(userTemporal.getFirstName());
                original.setLastName(userTemporal.getLastName());
                original.setEmail(userTemporal.getEmail());
                original.setPassword(userTemporal.getPassword());
                original.setRol(userTemporal.getRol());
                //original.setUserStatus(userTemporal.getUserStatus());
                original.setUpdatedAt(LocalDateTime.now());
                original.setUpdatedBy(USER_APP);

                String jsonOutput = objectMapper.writeValueAsString(original);
                UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
                return output;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> getRolOfUser(int idUser) {
        //List<Object> rolOfUser = new ArrayList<>();
        List<String> roles=new ArrayList<>();
        for(User user :users.values()){
            try {
                if(user.getId()==idUser){
                    String jsonOutput = objectMapper.writeValueAsString(user);
                    UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
                    //rolOfUser.add(user);
                    roles.add(user.getRol().getNameRol().toString());
                }
            } catch (Exception e){
                e.printStackTrace();
            }

        }
        return roles;
    }

    @Override
    public List<String> getPermissionsOfUser(int idUser) {
        List<String> permissions=new ArrayList<>();
        for(User user :users.values()){
            try {
                if(user.getId()==idUser){
                    String jsonOutput = objectMapper.writeValueAsString(user);
                    UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
                    //rolOfUser.add(user);
                    //List<PermissionType> list = new ArrayList<>();
                    for (PermissionType permissionType : user.getRol().getPermissions()) {
                        permissions.add(permissionType.toString());
                    }

                }
            } catch (Exception e){
                e.printStackTrace();
            }

        }
        return permissions;
    }
}
