package com.pkisi.kdaniel.WebService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Paczka {
    @Id
    @Column(name = "id_paczki")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name = "nr_paczki")
    private String nr_paczki;
    @Column(name = "koszt")
    private float koszt;
    @Column(name = "miasto")
    private String miasto;
    @Column(name = "ulica")
    private String ulica;
    @Column(name = "nr_domu")
    private String nr_domu;
    @Column(name = "nr_lokalu")
    private int nr_lokalu;
}
