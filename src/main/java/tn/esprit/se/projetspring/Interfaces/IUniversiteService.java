package tn.esprit.se.projetspring.Interfaces;

import tn.esprit.se.projetspring.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite>  retrieveAllUniversite();

    Universite addReservation(Universite u);

    Universite updateReservation( Universite u);

    Universite retrieveReservation(Long idUniversite);

    void removeReservation(Long idUniversite);
}
