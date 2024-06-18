package com.brixton.input.service;

import com.brixton.input.dto.request.UserRequestDTO;
import com.brixton.input.dto.response.UserResponseDTO;
import com.brixton.input.model.User;
import com.brixton.input.model.mappers.CustomDateDeserializer;
import com.fasterxml.jackson.core.JsonGenerator;
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
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private static final String USER_APP = "BRIXTON";
    Map<String, User> users = new HashMap<>();
    Map<String, String> userLoggeds= new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();
    public UserServiceImpl() {
        module.addDeserializer(LocalDate.class, new CustomDateDeserializer());
        module.addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
            @Override
            public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        });

        //module.addSerializer(LocalDateTimeSerializer);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(module);
        objectMapper.findAndRegisterModules();
    }

    public Object createUser(UserRequestDTO inputUser){

        try {
            String jsonInput = objectMapper.writeValueAsString(inputUser);
            User user = objectMapper.readValue(jsonInput, User.class);
            user.setCreatedAt(LocalDateTime.now());
            user.setCreatedBy(USER_APP);
            users.put(user.getUserName(), user);
            String jsonOutput = objectMapper.writeValueAsString(user);
            UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
            return output;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Object> createWithList(List<UserRequestDTO> inputUsers) {
        List<Object> outputUsers = new ArrayList<>();
        try {
            for(UserRequestDTO inputUser: inputUsers){
                String jsonInput = objectMapper.writeValueAsString(inputUser);

                User user = objectMapper.readValue(jsonInput, User.class);
                user.setCreatedAt(LocalDateTime.now());
                user.setCreatedBy(USER_APP);
                users.put(user.getUserName(), user);

                String jsonOutput = objectMapper.writeValueAsString(user);
                UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
                outputUsers.add(output);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return  outputUsers;
    }

    @Override
    public Object updateUser(String username, UserRequestDTO userActualizar) {
        try {
            String jsonInput = objectMapper.writeValueAsString(userActualizar);
            User userTemporal = objectMapper.readValue(jsonInput, User.class);

            User original = users.get(username);
            if(original != null){
                original.setFirstName(userTemporal.getFirstName());
                original.setLastName(userTemporal.getLastName());
                original.setEmail(userTemporal.getEmail());
                original.setPassword(userTemporal.getPassword());
                original.setPhone(userTemporal.getPhone());
                original.setUserStatus(userTemporal.getUserStatus());
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
    public Object getUsername(String username) {

        for(User user: users.values()){
            try {
                String jsonOutput = objectMapper.writeValueAsString(user);
                UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return users.get(username);
    }

    @Override
    public Object deleteUser(String username) {
        User userToRemove = users.remove(username);
        return (userToRemove == null? false : true);
    }

    @Override
    public Object login(String username, String password) {

        User user = users.get(username);
        if(user != null && user.getPassword().equals(password)){
            try {
                String jsonOutput = objectMapper.writeValueAsString(user);
                UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
                userLoggeds.put(user.getUserName(), user.getUserName());
                return output;

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    @Override
    public Boolean logout(String username) {
        String loggedUser = userLoggeds.get(username);
        if(loggedUser != null){

            userLoggeds.remove(loggedUser);
            return true;
        }
        return false;
    }
}
