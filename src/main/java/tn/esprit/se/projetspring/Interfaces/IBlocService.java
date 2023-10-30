package tn.esprit.se.projetspring.Interfaces;

import tn.esprit.se.projetspring.Entity.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBloc();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc  retrieveBloc(Long idBloc);

    void removeFoyer(Long idBloc);
}
