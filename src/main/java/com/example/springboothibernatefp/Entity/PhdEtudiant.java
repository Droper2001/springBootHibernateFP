package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
public class PhdEtudiant extends Personne{
    private String sujet;

    @OneToMany(mappedBy = "phdEtudiant")
    private List<Inscription> inscription;
    @ManyToOne
    private Ced ced;
    @OneToMany(mappedBy = "phdEtudiant_sout")
    private Collection<Soutenance> soutenance;
}
