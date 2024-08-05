package com.example.cinemaservice.repository.customize;

import com.example.cinemaservice.entity.Province;
import com.example.dto.base.ListDataResponse;

public interface ProvinceRepositoryCustom {

    ListDataResponse findProviceByCondition(String provinceName);

}
