package com.example.cinemaservice.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

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
