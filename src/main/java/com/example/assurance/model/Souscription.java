package com.example.assurance.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Souscription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Client client;
    @ManyToOne
    private TypeAssurance typeAssurance;
    private Date dateSouscription;
    // Getters and Setters

    public Souscription() {
    }

    public Souscription(Client client, TypeAssurance typeAssurance, Date dateSouscription) {
        this.client = client;
        this.typeAssurance = typeAssurance;
        this.dateSouscription = dateSouscription;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public TypeAssurance getTypeAssurance() {
        return this.typeAssurance;
    }

    public void setTypeAssurance(TypeAssurance typeAssurance) {
        this.typeAssurance = typeAssurance;
    }

    public Date getDateSouscription() {
        return this.dateSouscription;
    }

    public void setDateSouscription(Date dateSouscription) {
        this.dateSouscription = dateSouscription;
    }
}