package tn.esprit.se.projetspring.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.projetspring.Entity.Bloc;
import tn.esprit.se.projetspring.Interfaces.IBlocService;
import tn.esprit.se.projetspring.repository.BlocRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class BlocService  implements IBlocService {

    BlocRepository blocRepository ;

    @Override
    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeFoyer(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }
}
