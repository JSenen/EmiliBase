package com.juansenen.emilibase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "trailer")
public class Trailer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trailer")
    private long idTrailer;
    @Column
    private String plate;

    @ManyToMany(mappedBy = "trailers")
    private Set<Lorry> lorries = new HashSet<>();

}
