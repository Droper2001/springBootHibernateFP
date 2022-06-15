package com.example.springboothibernatefp.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class Section {
    @Id
    @Column(name = "sectionId")
    private int id;

    @OneToMany(mappedBy = "idsection")
    private List<ProfesseurHasModule> professeurHasModules;
}
