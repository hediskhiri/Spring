package com.example.apli.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class foyer {
    @Id
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    public foyer() {
    }

    public foyer(long idFoyer, String nomFoyer, long capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }

    public long getIdFoyer() {
        return idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setCapaciteFoyer(long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }
}