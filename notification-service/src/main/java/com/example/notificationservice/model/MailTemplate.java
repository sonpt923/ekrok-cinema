package com.example.notificationservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "mail_template")
public class MailTemplate {

    @Id
    private String id;

    private String code;

    private String subject;

    private Integer active;

    private Integer sendType;

    // mục địch của template
    private String description;

    private String content;

    private String createdBy;

    private String updatedBy;

    private String createdAt;

    private String updatedAt;

}
