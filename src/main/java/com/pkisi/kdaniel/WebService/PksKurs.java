package com.pkisi.kdaniel.WebService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@Table(name = "PKSKURS")
public class PksKurs {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "KURSFROM")
    private String from;
    @Column(name = "KURSTO")
    private String to;
    @Column(name = "DEPARTURE")
    private String departure;
    @Column(name = "ARRIVAL")
    private String arrival;
    @Column(name = "NR_REJ")
    private String nr_rej;
}
