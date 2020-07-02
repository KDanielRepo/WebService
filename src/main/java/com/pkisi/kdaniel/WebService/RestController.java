package com.pkisi.kdaniel.WebService;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    @Autowired
    PrzesylkaRepo przesylkaRepo;
    @Autowired
    EntityRepo entityRepo;
    @Autowired
    AdresRepo adresRepo;
    @Autowired
    PksKursRepo pksKursRepo;
    @Autowired
    PksBiletRepo pksBiletRepo;
    @Autowired
    KsiazkaRepo ksiazkaRepo;
    @Autowired
    AutorRepo autorRepo;
    @Autowired
    HomelibRepo homelibRepo;


    @GetMapping("/workers")
    public @ResponseBody
    Iterable<Pracownik> getWorkers(){
        return entityRepo.findAll();
    }

    @GetMapping("/adres")
    public @ResponseBody
    Iterable<Adres> getAdres(){
        return adresRepo.findAll();
    }

    @GetMapping("/kurs")
    public @ResponseBody
    Iterable<PksKurs> getKurses(){
        System.out.println(pksKursRepo.findAll());
        return pksKursRepo.findAll();
    }

    @GetMapping("/bilet")
    public @ResponseBody
    Iterable<PksBilet> getBilets(){
        return pksBiletRepo.findAll();
    }

    @GetMapping("/parcels")
    public @ResponseBody
    List<Paczka> getParcels(){
        Session session = HibernateSession.getSessionFactory().openSession();
        List<Paczka> list = session.createNativeQuery("select \"PRZESYLKA\".\"id_paczki\", \"nr_paczki\" ,\"koszt\",\"miasto\",\"ulica\",\"nr_domu\",\"nr_lokalu\" from \"PRZESYLKA\" inner join \"ADRES_PRZESYLKA\" on \"PRZESYLKA\".\"id_paczki\" = \"ADRES_PRZESYLKA\".\"id_paczki\" inner join \"ADRES\" on \"ADRES_PRZESYLKA\".\"adr_odb\" = \"ADRES\".\"id_adres\"",Paczka.class).getResultList();
        System.out.println(list.get(0).getMiasto());
        /*return przesylkaRepo.findAll();*/
        return list;
    }
    @PostMapping("/bilet")
    public PksBilet newBilet(@RequestBody PksBilet bilet){
        return pksBiletRepo.save(bilet);
    }
    @PostMapping("/kurs")
    public PksKurs newKurs(@RequestBody PksKurs kurs){
        return pksKursRepo.save(kurs);
    }
    @PostMapping("/remove")
    public void removeKurs(@RequestBody PksKurs kurs){
        pksKursRepo.deleteById(kurs.getId());
    }

    @GetMapping("/ksiazki")
    public @ResponseBody
    Iterable<Ksiazka> getKsiazki(){return ksiazkaRepo.findAll();}

    @GetMapping("/autorzy")
    public @ResponseBody
    Iterable<Autor> getAutorzy(){return autorRepo.findAll();}

    @PostMapping("/ksiazki")
    public Ksiazka newKsiazka(@RequestBody Ksiazka ksiazka){
        return ksiazkaRepo.save(ksiazka);
    }
    @PostMapping("/autorzy")
    public Autor newAutor(@RequestBody Autor autor){
        return autorRepo.save(autor);
    }
    @GetMapping("/ola")
    public @ResponseBody
    Iterable<Homelib> getAll(){
        return homelibRepo.findAll();
        /*Session session = HibernateSession.getSessionFactory().openSession();
        List<Homelib> list = session.createNativeQuery("select \"KSIAZKA\".\"ID\", \"TYTUL\" ,\"SERIA\",\"TOM\",\"ROK\",\"WYDAWNICTWO\",\"POSIADAM\",\"ID_AUTOR\",\"IMIE\",\"NAZWISKO\" from \"KSIAZKA\" inner join \"AUTOR\" on \"AUTOR\".\"ID\" = \"KSIAZKA\".\"ID_AUTOR\"", Homelib.class).getResultList();
        *//*return przesylkaRepo.findAll();*//*
        return list;*/
    }
    @PostMapping("/ola")
    public Homelib newHomelib(@RequestBody Homelib homelib){
        return homelibRepo.save(homelib);
    }

}
