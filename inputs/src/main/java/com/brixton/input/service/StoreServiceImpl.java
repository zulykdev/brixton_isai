package com.brixton.input.service;

import com.brixton.input.dto.request.StoreGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import com.brixton.input.dto.response.StoreResponseDTO;
import com.brixton.input.model.Pet;
import com.brixton.input.model.Store;
import com.brixton.input.model.mappers.CustomDateDeserializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class StoreServiceImpl implements StoreService{
    private static final String USER_APP = "BRIXTON";
    Map<Integer, Store> orders = new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();

    public StoreServiceImpl(){
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
    public Object saveOrder(StoreGenericRequestDTO orderForRegister) {
        try {
            String jsonInput = objectMapper.writeValueAsString(orderForRegister);
            Store store = objectMapper.readValue(jsonInput, Store.class);
            store.setCreatedAt(LocalDateTime.now());
            store.setCreatedBy(USER_APP);
            orders.put(store.getId(), store);

            String jsonOutput = objectMapper.writeValueAsString(store);
            StoreResponseDTO output = objectMapper.readValue(jsonOutput, StoreResponseDTO.class);
            return output;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Object> getInventory(String status) {
        List<Object> ordersByStatusFound = new ArrayList<>();
        for(Store store :orders.values()){
            try {
                if(store.getStatus().toString().equals(status.toUpperCase())){
                    String jsonOutput = objectMapper.writeValueAsString(store);
                    StoreResponseDTO output = objectMapper.readValue(jsonOutput, StoreResponseDTO.class);
                    ordersByStatusFound.add(store);
                }
            } catch (Exception e){
                e.printStackTrace();
            }

        }
        return ordersByStatusFound;
    }

    @Override
    public Object getOrder(int idOrder) {
        Store storeFound = orders.get(idOrder);
        try {
            String jsonOutput = objectMapper.writeValueAsString(storeFound);
            StoreResponseDTO output = objectMapper.readValue(jsonOutput, StoreResponseDTO.class);
            return output;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteOrder(int idOrder) {
        Store orderToRemove = orders.remove(idOrder);
        return (orderToRemove == null ? false : true);
        //return (orderToRemove != null);
    }
}
