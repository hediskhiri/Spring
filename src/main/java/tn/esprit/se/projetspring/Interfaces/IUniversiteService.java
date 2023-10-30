package tn.esprit.se.projetspring.Interfaces;

import tn.esprit.se.projetspring.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite>  retrieveAllUniversite();

    Universite addUniversite(Universite u);

    Universite updateUniversite( Universite u);

    Universite retrieveUniversite(Long idUniversite);

    void removeUniversite(Long idUniversite);
}
