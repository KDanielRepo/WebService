package com.pkisi.kdaniel.WebService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Data
public class Pracownik {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "\"id_prac\"")
    private int id;
    @Column(name = "\"imie_prac\"")
    private String name;
    @Column(name = "\"nazwisko_prac\"")
    private String surname;
    @Column(name = "\"nr_tel_prac\"")
    private int phone;
    @Column(name = "\"pensja\"")
    private float wage;
    @Column(name = "\"data_zat\"")
    private Date employment;
    @Column(name = "\"data_zwol\"")
    private Date fired;
}
