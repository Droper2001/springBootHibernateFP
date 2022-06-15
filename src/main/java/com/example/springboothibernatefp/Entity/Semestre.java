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
public class Semestre {
    @Id
    private int id;
    private String name_semester;
    @ManyToOne
    private Filiere fillier_id;
    @OneToMany(mappedBy = "semestre")
    private List<Module> module;
}