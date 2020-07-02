package com.pkisi.kdaniel.WebService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "AUTOR")
public class Autor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "IMIE")
    private String name;
    @Column(name = "NAZWISKO")
    private String surname;
}
