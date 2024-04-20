package com.example.mailservice.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("")
public class EmailLogs {

    @Id
    private String id;



}
