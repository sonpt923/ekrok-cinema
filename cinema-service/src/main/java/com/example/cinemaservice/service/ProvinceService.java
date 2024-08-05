package com.example.cinemaservice.service;

import com.example.cinemaservice.dto.request.ProvinceRequest;
import com.example.cinemaservice.entity.Province;
import com.example.dto.base.ListDataResponse;

public interface ProvinceService {

    Object createProvice(Province province);

    Object updateProvice(Province province);

    ListDataResponse findProviceByCondition(ProvinceRequest request);

}
