package com.example.notificationservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mail_template")
public class MailTemplate {

    @Id
    private String id;

    private String code;

    private String name;

    private String subject;

    private String content;

    private String createdBy;

    private String updatedBy;

    private String createdAt;

    private String updatedAt;

}
