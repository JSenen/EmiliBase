package com.juansenen.emilibase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_review")
    private long idReview;
    @Column
    private float price;
    @Column(name = "km_review")
    private int kmReview;
    @Column
    private String comments;
    @Column
    private String ODC;
    @Column
    private boolean exported;
    @Column(name = "date_in")
    private Date dateIn;
    @Column(name = "date_out")
    private Date dateOut;

    @ManyToOne
    @JoinColumn(name = "idlorry_review")
    private Lorry lorry;
}
