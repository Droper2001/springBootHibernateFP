package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
@Entity
@AllArgsConstructor@NoArgsConstructor

public class Inscription {
    @Id
    private int id;
    private Date dateInscription;
    @ManyToOne
    private PhdEtudiant phdEtudiant;
}
