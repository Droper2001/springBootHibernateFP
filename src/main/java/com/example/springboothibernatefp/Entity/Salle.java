package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salle {
    @Id
    private Long id;

    private String code;
    private String name;
    private Integer capacity;
    private Integer nombreDeSurveillant;

    @OneToMany(mappedBy = "salle")
    private Collection<Examen> examen;

    @OneToMany(mappedBy = "salle_sout")
    private Collection<Soutenance> soutenances;

}