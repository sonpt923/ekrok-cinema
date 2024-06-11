package com.example.bookingservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TypeTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "")
    private String name;

    @Column(name = "status")
    private Long status;

    @Column(name = "note")
    private String note;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "delted_time")
    private Date deleted_time;

    @Column(name = "deleted_by")
    private String deletedBy;

}
