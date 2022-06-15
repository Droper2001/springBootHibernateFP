package com.example.springboothibernatefp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Labo {
    @Id
    private int id;
    @ManyToOne
    private Ced ced;
}
