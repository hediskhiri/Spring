package com.example.apli.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

    public reservation() {
    }

    public reservation(String idReservation, Date anneeUniversitaire, boolean estValide) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
}
