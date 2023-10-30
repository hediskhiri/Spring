package tn.esprit.se.projetspring.Interfaces;

import tn.esprit.se.projetspring.Entity.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyer();

    Foyer addFoyer(Foyer f);

    Foyer updateEtudiant(Foyer f);

    Foyer retrieveFoyer(Long idFoyer);

    void removeFoyer(Long idFoyer);
}
