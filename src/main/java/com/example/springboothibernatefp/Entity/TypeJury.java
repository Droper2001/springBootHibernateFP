package com.example.springboothibernatefp.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

public class TypeJury {
    @Id
    private int id;

    @OneToMany(mappedBy = "typeJury")
    private Collection<Jury> jury;
}
