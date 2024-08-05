package com.example.cinemaservice.repository.customize.impl;

import com.example.cinemaservice.repository.customize.ProvinceRepositoryCustom;
import com.example.dto.base.ListDataResponse;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProvinceRepositoryCustomImpl implements ProvinceRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ListDataResponse findProviceByCondition(String provinceName) {

        ListDataResponse listDataResponse = new ListDataResponse();
        StringBuilder sql = new StringBuilder();
        Map<String, Object> params = new HashMap<String, Object>();

        sql.append("select * from province where provinceName like :provinceName");

        Query query = entityManager.createQuery(sql.toString());
        params.forEach(query::setParameter);
        listDataResponse.setListResponse(query.getResultList());

        sql.setLength(0);
        params.clear();

        sql.append("select * from province where provinceName like :provinceName");

        query = entityManager.createQuery(sql.toString());
        params.forEach(query::setParameter);
        listDataResponse.setTotalRecords((Integer) query.getSingleResult());

        return listDataResponse;
    }
}
