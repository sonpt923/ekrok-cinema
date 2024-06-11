package com.example.notificationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "notifications")
public class Notify {

    @Id
    private String id;

    private String title;

    private String content;

    private String type;

    private String recipient;

    private String status;

    private Date createdAt;

    private Date updatedAt;

}
