package com.brixton.gestiontareas.service;

import com.brixton.gestiontareas.dto.request.TaskRequestDTO;
import com.brixton.gestiontareas.dto.response.TaskResponseDTO;
import com.brixton.gestiontareas.model.Task;
import com.brixton.gestiontareas.model.mapper.CustomDateDeserializer;
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
public class TaskServiceImpl implements TaskService{
    private static final String USER_APP = "ADMIN";
    Map<Integer, Task> tasks = new HashMap<>();
    Map<String, String> userLoggeds= new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();

    public TaskServiceImpl() {
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
    public Object newTask(TaskRequestDTO newTask) {
        try {
            String jsonInput = objectMapper.writeValueAsString(newTask);
            Task task = objectMapper.readValue(jsonInput, Task.class);
            //order.getInvoice().setOrderId(order.getId());
            //order.getInvoice().getOrdersLine().get(order.getId());
            task.setCreatedAt(LocalDateTime.now());
            task.setCreatedBy(USER_APP);
            tasks.put(task.getId(), task);
            String jsonOutput = objectMapper.writeValueAsString(task);
            TaskResponseDTO output = objectMapper.readValue(jsonOutput, TaskResponseDTO.class);
            return output;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getTask(int idTask) {
        return null;
    }

    @Override
    public Object updateTrackingTask(int idTask, TaskRequestDTO taskToUpdate) {
        return null;
    }

    @Override
    public Object getUser(int idTask) {
        return null;
    }
}
