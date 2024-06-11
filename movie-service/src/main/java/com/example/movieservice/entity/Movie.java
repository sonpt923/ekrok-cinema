package com.example.movieservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "movie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_director", referencedColumnName = "id")
    private Director director;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "time")
    private Date time;

    @Column(name = "status")
    private Integer status;

    @Column(name = "premiere_date")
    private Date premiereDate;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "created_By")
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
