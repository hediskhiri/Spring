package tn.esprit.se.projetspring.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.projetspring.Entity.Foyer;
import tn.esprit.se.projetspring.Interfaces.IFoyerService;
import tn.esprit.se.projetspring.repository.FoyerRepository;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class FoyerService implements IFoyerService {

    FoyerRepository foyerRepository ;
    @Override
    public List<Foyer> retrieveAllFoyer() {
        return foyerRepository.findAll();
    }


    @Override
    public Foyer addFoyer(Foyer f) {
        return  foyerRepository.save(f);
    }

    @Override
    public Foyer updateEtudiant(Foyer f) {
        return  foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);

    }
}
