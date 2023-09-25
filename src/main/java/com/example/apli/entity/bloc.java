package com.example.apli.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class bloc {
    @Id
    private long idBloc;
    private String nomBloc;
    private long capciteBloc;

    public bloc() {
    }

    public bloc(long idBloc, String nomBloc, long capciteBloc) {
        this.idBloc = idBloc;
        this.nomBloc = nomBloc;
        this.capciteBloc = capciteBloc;
    }

    public long getIdBloc() {
        return idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public long getCapciteBloc() {
        return capciteBloc;
    }

    public void setIdBloc(long idBloc) {
        this.idBloc = idBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public void setCapciteBloc(long capciteBloc) {
        this.capciteBloc = capciteBloc;
    }
}