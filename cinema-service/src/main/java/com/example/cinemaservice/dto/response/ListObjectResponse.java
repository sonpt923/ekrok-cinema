package com.example.cinemaservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListObjectResponse<T> {

    private List<T> listResponse;

    private Integer totalRecord;

}
