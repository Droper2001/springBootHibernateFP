package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Module {
    @Id
    @Column(name = "Module_id")
    private int id;
    private String groupes;
    @ManyToOne
    private Semestre semestre;
    @OneToMany(mappedBy = "idmodule")
    @ToString.Exclude
    private List<ProfesseurHasModule> professeurHasModules;
}