package com.example.backend_.controller.dto.client;

import lombok.Data;

@Data
public class ClientDto {
    private Long id;

    private String name;

    private String surname;

    private String email;

    private String phone;
}
