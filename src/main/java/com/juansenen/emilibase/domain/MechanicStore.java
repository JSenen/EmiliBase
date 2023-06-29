package com.juansenen.emilibase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String address;
    private String phone;
    private String nif;
    private String city;
    private String type;
}
