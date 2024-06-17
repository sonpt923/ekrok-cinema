package com.example.cinemaservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "chair")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_room", referencedColumnName = "id")
    private Room room;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_chair_type", referencedColumnName = "id")
    private ChairType chairType;

    @Column(name = "code")
    private String code;

    @Column(name = "position")
    private String position;

    @Column(name = "status")
    private Integer status;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

    @Column(name = "updated_by")
    private String updatedBy;


}
