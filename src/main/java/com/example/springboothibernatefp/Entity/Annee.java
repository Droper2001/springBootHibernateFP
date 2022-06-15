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
public class Annee {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idAnnee;
    private String annee;
    @OneToMany(mappedBy = "annee")
    private List<ProfesseurHasModule> professeurHasModules;
}