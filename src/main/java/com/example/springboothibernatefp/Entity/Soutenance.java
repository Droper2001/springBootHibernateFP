package com.example.springboothibernatefp.Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

public class Soutenance {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String sujet;

    @Column
    private Date date;

    @Column
    private String soutenanceCol;
    @OneToMany(mappedBy = "Jsoutenance")
    private Collection<Jury> jury;
    @ManyToOne
    private Salle salle;
    @ManyToOne
    private PhdEtudiant phdEtudiant_sout;
    @ManyToOne
    private Professeur professeur;
    @ManyToOne
    private Salle salle_sout;

}
