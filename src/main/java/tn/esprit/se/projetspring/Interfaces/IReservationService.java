package tn.esprit.se.projetspring.Interfaces;

import tn.esprit.se.projetspring.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation(Reservation r);

    Reservation updateReservation( Reservation r);

    Reservation retrieveReservation(String idReservation);

    void removeFoyer(String idReservation);
}
