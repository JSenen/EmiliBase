package com.juansenen.emilibase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "lorry")
public class Lorry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lorry")
    private long idLorry;
    @Column
    private String brand;
    @Column
    private int km;
    @Column
    private String model;

    @OneToMany (mappedBy = "lorry",cascade = CascadeType.ALL)
    private List<Review> reviewList;

    @ManyToMany
    @JoinTable(
            name = "lorry_trailer",
            joinColumns = @JoinColumn(name = "lorry_id"),
            inverseJoinColumns = @JoinColumn(name = "trailer_id")
    )
    private Set<Trailer> trailers = new HashSet<>();
}

