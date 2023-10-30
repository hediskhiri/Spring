package tn.esprit.se.projetspring.Interfaces;

import tn.esprit.se.projetspring.Entity.Chambre;

import java.util.List;

public interface IchambreService {
    List<Chambre> retrieveAllChambre();

    Chambre addChambre(Chambre c);

    Chambre updateChambre(Chambre c);

    Chambre retrieveChambre(Long idChambre);

    void removeChambre(Long idChambre);
}
