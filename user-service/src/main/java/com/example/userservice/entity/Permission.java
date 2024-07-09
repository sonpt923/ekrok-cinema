package com.example.userservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "permisson")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Permission {

    @Id
    @Column(name = "group_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
