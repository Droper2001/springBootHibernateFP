package com.example.springboothibernatefp.Entity;

import jdk.jfr.Timestamp;

import javax.persistence.*;
import java.util.Collection;

@Entity
//@Table(name = "etudiant")
public class Etudiant extends Personne {
    @ManyToOne
    private Filiere idfiliere;

    @OneToMany(mappedBy = "idEtudiant")
    private Collection<ProfesseurHasModuleHasEtudiant> professeurHasModuleHasEtudiants;
}