package com.brixton.gestionpedidos.service;

import com.brixton.gestionpedidos.dto.request.OrderRequestDTO;
import com.brixton.gestionpedidos.dto.response.OrderResponseDTO;
import com.brixton.gestionpedidos.model.Address;
import com.brixton.gestionpedidos.model.Order;
import com.brixton.gestionpedidos.model.TypeStatus;
import com.brixton.gestionpedidos.model.mappers.CustomDateDeserializer;
import com.brixton.gestionpedidos.model.mappers.AddressMapper;
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
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService{
    private static final String USER_APP = "ADMIN";
    Map<Integer, Order> orders = new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();
    public OrderServiceImpl() {
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
    public Object saveOrder(OrderRequestDTO newOrder) {
        try {
            String addressDTO = newOrder.getInvoice().getClient().getAddressClient();
            Address address = AddressMapper.mapAddressDTOToAddress(addressDTO); //log.info("imprime address: "+ address);
            String jsonInput = objectMapper.writeValueAsString(newOrder);
            Order order = objectMapper.readValue(jsonInput, Order.class);
            order.getInvoice().setOrderId(order.getId());
            order.getInvoice().getClient().setAddress(address);
            order.getShipping().setAddress(addressDTO);
            order.getShipping().setStatus(TypeStatus.PREPARING);
            order.getShipping().setTrackNumber(String.valueOf(order.getId()) +"-"+ String.valueOf(order.getShipping().getId()));
            order.setCreatedAt(LocalDateTime.now());
            order.setCreatedBy(USER_APP);
            orders.put(order.getId(), order);
            String jsonOutput = objectMapper.writeValueAsString(order); //log.info(jsonOutput);
            OrderResponseDTO output = objectMapper.readValue(jsonOutput, OrderResponseDTO.class);

            return output;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Object getOrder(int orderId) {
        Order orderFound = orders.get(orderId);
        try {
            String jsonOutput = objectMapper.writeValueAsString(orderFound);
            OrderResponseDTO output = objectMapper.readValue(jsonOutput, OrderResponseDTO.class);
            return output;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getInvoice(int orderId) {
        Order orderFound = orders.get(orderId);
        if(orderFound!=null){
            try {
                String jsonOutput = objectMapper.writeValueAsString(orderFound);
                OrderResponseDTO output = objectMapper.readValue(jsonOutput, OrderResponseDTO.class);
                return output.getInvoice();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    @Override
    public String getStatusShipping(int orderId) {
        Order orderFound = orders.get(orderId);
        if(orderFound!=null){
            try {
                String jsonOutput = objectMapper.writeValueAsString(orderFound);
                OrderResponseDTO output = objectMapper.readValue(jsonOutput, OrderResponseDTO.class);
                return output.getShipping().getStatus();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
