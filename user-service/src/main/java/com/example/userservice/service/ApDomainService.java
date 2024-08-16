package com.example.userservice.service;

import com.example.userservice.entity.ApDomain;

import javax.xml.bind.ValidationException;
import java.util.List;

public interface ApDomainService {

    List<ApDomain> getByParentCode(String parentCode, String token) throws ValidationException;

    

    ApDomain getByCode(String code, String token);

    ApDomain create(ApDomain apDomain, String token);

    ApDomain update(ApDomain apDomain, String token);


}
