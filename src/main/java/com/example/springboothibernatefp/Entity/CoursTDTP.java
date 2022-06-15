package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "cours_tdtp")
public class CoursTDTP {
    @Id
    @Column(name = "id_courstptp")
    private int id;
    @OneToMany(mappedBy = "idcoursTdTp")
    @ToString.Exclude
    private List<ProfesseurHasModule> professeurHasModules;
}