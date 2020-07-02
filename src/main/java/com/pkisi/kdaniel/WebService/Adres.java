package com.pkisi.kdaniel.WebService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
public class Adres {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "\"id_adres\"")
    private int id;
    @Column(name = "\"wojewodztwo\"")
    private String wojewodztwo;
    @Column(name = "\"miasto\"")
    private String miasto;
    @Column(name = "\"ulica\"")
    private String ulica;
    @Column(name = "\"nr_domu\"")
    private String nr;
    @Column(name = "\"nr_lokalu\"")
    private int nrLok;
}
