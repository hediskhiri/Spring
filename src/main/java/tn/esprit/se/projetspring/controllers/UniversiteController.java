package tn.esprit.se.projetspring.controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.projetspring.Entity.Universite;
import tn.esprit.se.projetspring.Interfaces.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteController {


    IUniversiteService universiteService;

    @GetMapping("/retrieve-all-universities")
    public List<Universite> retrieveAllUniversities() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversite();
        return listUniversites;
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite) {
        universiteService.addUniversite(universite);
        return universiteService.retrieveAllUniversite().get(universiteService.retrieveAllUniversite().size() - 1);
    }

    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @GetMapping("/retrieve-universite/{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }
    @DeleteMapping("/remove-universite/{idUniversite}")
    public void removeUniversite(@PathVariable long idUniversite) {
        universiteService.removeUniversite(idUniversite);

    }
}
