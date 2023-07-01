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
@Entity(name = "mechanic_store")
public class MechanicStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mechanic")
    private long idMechanic;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private String nif;
    @Column
    private String city;
    @Column
    private String type;

    @ManyToMany (mappedBy = "mechanicStoreSet")
    private Set<Review> reviewSet = new HashSet<>();
}
