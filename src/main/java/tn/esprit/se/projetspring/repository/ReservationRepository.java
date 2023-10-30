package tn.esprit.se.projetspring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.projetspring.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
