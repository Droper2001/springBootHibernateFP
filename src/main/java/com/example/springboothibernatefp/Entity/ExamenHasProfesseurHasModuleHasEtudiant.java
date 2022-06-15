package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ExamenHasProfesseurHasModuleHasEtudiant {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_exam")
    private Examen examen;
    @ManyToOne
    @JoinColumn(name = "professeur_has_module_has_etudiant")
    private ProfesseurHasModuleHasEtudiant professeurHasModuleHasEtudiant;
}