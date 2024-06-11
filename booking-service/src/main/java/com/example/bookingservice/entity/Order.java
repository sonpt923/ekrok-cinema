package com.example.bookingservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "id_employee")
    private Long idEmployee;

    @Column(name = "code")
    private String code;

    @Column(name = "status")
    private Long status;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "discount_amount")
    private BigDecimal discountAmount;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "created_by")
    private Date createdBy;

    @Column(name = "delted_time")
    private Date deleted_time;

    @Column(name = "deleted_by")
    private String deletedBy;

}
