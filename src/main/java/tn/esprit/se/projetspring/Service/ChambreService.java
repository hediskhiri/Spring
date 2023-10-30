package tn.esprit.se.projetspring.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.projetspring.Entity.Chambre;
import tn.esprit.se.projetspring.Interfaces.IchambreService;
import tn.esprit.se.projetspring.repository.ChambreRepository;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class ChambreService implements IchambreService {

    ChambreRepository chambreRepository ;
    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
