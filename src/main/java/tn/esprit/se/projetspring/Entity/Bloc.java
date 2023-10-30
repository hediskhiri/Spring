package tn.esprit.se.projetspring.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc; // Clé primaire
    private String nomBloc;
    private Long capaciteBloc;
/////////////////////////////////////////////////////////////////////////////////////////////////

    @Getter
    @Setter

    @ManyToOne
    Foyer foyers;

    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;

}
