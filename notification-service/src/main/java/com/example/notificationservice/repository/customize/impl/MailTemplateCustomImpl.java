package com.example.notificationservice.repository.customize.impl;

import com.example.notificationservice.repository.customize.MailTemplateRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MailTemplateCustomImpl implements MailTemplateRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

}
