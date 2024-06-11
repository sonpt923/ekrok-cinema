package com.example.cinemaservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "room")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "status")
    private Long status;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "delted_time")
    private java.util.Date deleted_time;

    @Column(name = "deleted_by")
    private String deletedBy;


}
