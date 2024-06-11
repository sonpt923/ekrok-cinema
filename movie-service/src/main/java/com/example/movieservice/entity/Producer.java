package com.example.movieservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "producer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private Integer status;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "delted_time")
    private Date deleted_time;

    @Column(name = "deleted_by")
    private String deletedBy;

}
