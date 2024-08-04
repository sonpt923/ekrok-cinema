package com.example.notificationservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;

@Document(collection = "notifications")
public class Notification {

    @Id
    private String id;

    private String content;

    private String type;

    private String link;

    private String status;

    private Date createdAt;

    private Date createdBy;


}
