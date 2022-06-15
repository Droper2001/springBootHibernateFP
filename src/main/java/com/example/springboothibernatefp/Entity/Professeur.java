package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Professeur extends Personne {

    private String grade;
    private String telephone;

    @OneToMany(mappedBy = "responsable")
    private List<Filiere> fillier;

    @OneToMany(mappedBy = "idprofesseur")
    private List<ProfesseurHasModule> professeurHasModules;
    @OneToMany(mappedBy = "professeur")
    private Collection<Jury> jury;
    @ManyToOne
    private LieuDeTravail idLieuTravail;
    @OneToMany(mappedBy = "profSurveillant")
    private Collection<Surveillant> surveillants;
    @ManyToOne
    private Examen id_examen;
    @ManyToOne
    private Extern id_extern;



}