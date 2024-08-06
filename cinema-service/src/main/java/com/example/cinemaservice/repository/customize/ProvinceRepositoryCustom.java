package com.example.cinemaservice.repository.customize;

import com.example.cinemaservice.dto.request.ProvinceRequest;
import com.example.cinemaservice.entity.Province;
import com.example.dto.base.ListDataResponse;

public interface ProvinceRepositoryCustom {

    ListDataResponse findProviceByCondition(ProvinceRequest request);

}
