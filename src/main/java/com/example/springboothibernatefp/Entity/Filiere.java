package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String name;

    @ManyToOne
    private Professeur responsable;

    @ManyToOne
    private Type type;

    @OneToMany(mappedBy = "fillier_id")
    private List<Semestre> semestre;

    @OneToMany(mappedBy = "idfiliere")
    private List<Etudiant> etudiant;

    @ManyToOne
    private Departement depart_filliere;
}