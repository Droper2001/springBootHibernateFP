package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Ced {
    @Id
    private int idCed;
    @OneToMany(mappedBy = "ced")
    private List<Labo> labo;

    @OneToMany(mappedBy = "idCed")
    private List<Equipe> equipes;
}
