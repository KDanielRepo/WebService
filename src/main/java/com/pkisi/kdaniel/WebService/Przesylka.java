package com.pkisi.kdaniel.WebService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Przesylka {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "\"id_paczki\"")
    private int id;
    @Column(name = "\"id_klient\"")
    private int idKlient;
    @Column(name = "\"nr_paczki\"")
    private String nr;
    @Column(name = "\"waga_paczki\"")
    private float waga;
    @Column(name = "\"koszt\"")
    private float koszt;
    @Column(name = "\"stan\"")
    private String stan;
    @Column(name = "\"wymiar_x\"")
    private float x;
    @Column(name = "\"wymiar_y\"")
    private float y;
    @Column(name = "\"wymiar_z\"")
    private float z;
    @Column(name = "\"ubezpieczenie\"")
    private int ubezpieczenie;

}
