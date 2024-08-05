package com.example.userservice.repository.customize.impl;

import com.example.dto.base.ListDataResponse;
import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.repository.customize.UserRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ListDataResponse<Object> findAccountByCondition(UserRequest request) {
        ListDataResponse<Object> listDataResponse = new ListDataResponse();
        StringBuilder sql = new StringBuilder();
        Map<String, Object> params = new HashMap<>();

        sql.append("SELECT u FROM User u WHERE 1 = 1");

        Query query = entityManager.createQuery(sql.toString());
        params.forEach(query::setParameter);
        listDataResponse.setListResponse(query.getResultList());

        sql.setLength(0);
        params.clear();

        sql.append("SELECT COUNT(u.*) FROM User u WHERE 1 = 1");

        query = entityManager.createQuery(sql.toString());
        params.forEach(query::setParameter);

        listDataResponse.setTotalRecords(Integer.valueOf((String) query.getSingleResult()));
        return listDataResponse;
    }
}
