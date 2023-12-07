package com.example.voiture.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    @Column(name = "id_client")
    private Long clientId;

    @Transient
    @ManyToOne
    private Client client;



}
