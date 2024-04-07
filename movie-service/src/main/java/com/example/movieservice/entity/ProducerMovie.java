package com.example.movieservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producer_movie")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProducerMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_actor")
    private Producer actor;

    @ManyToOne
    @JoinColumn(name = "id_movie")
    private Movie movie;

}
