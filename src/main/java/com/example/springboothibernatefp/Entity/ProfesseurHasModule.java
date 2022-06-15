package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProfesseurHasModule {
    @Id
    @GeneratedValue
    private int idProfesseurHasModule;
    @ManyToOne
    private Annee annee;
    @ManyToOne
    private Professeur professeur;
    @ManyToOne
    private Module module;
    @ManyToOne
    private CoursTDTP coursTDTP;
}