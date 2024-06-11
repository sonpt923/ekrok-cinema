package com.example.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_day")
    private Date birthDay;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "role")
    private Long role;

    @Column(name = "status")
    private Long status;

    @Column(name = "password")
    private String password;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "deleted_by")
    private String deletedBy;

    @Column(name = "deleted_time")
    private Date deletedTime;

}
