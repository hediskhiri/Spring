package tn.esprit.se.projetspring.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.projetspring.Entity.Reservation;
import tn.esprit.se.projetspring.Interfaces.IReservationService;
import tn.esprit.se.projetspring.repository.ReservationRepository;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class ReservationService implements IReservationService {

    ReservationRepository reservationRepository ;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll() ;
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public void removeFoyer(String idReservation) {
        reservationRepository.deleteById(idReservation);

    }
}
