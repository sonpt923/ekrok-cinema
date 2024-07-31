package com.example.notificationservice.repository;

import com.example.notificationservice.model.EmailTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailTemplateRepository extends MongoRepository<EmailTemplate, String> {

    EmailTemplate findByCode(String code);

}
