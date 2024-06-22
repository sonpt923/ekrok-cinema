package com.example.movieservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "movie_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_people")
    private Person people;

    @ManyToOne
    @JoinColumn(name = "id_movie")
    private Movie movieId;

    @Column(name = "role")
    private Integer role;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "created_By")
    private String createdBy;

    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "updated_by")
    private String updatedBy;

}
