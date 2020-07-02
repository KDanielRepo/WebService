package com.pkisi.kdaniel.WebService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "HOMELIB")
public class Homelib {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "IMIE")
    private String name;
    @Column(name = "NAZWISKO")
    private String surname;
    @Column(name = "TYTUL")
    private String title;
    @Column(name = "SERIA")
    private String series;
    @Column(name = "TOM")
    private String tom;
    @Column(name = "ROK")
    private String year;
    @Column(name = "WYDAWNICTWO")
    private String wydawnictwo;
    @Column(name = "POSIADANA")
    private String have;

}
