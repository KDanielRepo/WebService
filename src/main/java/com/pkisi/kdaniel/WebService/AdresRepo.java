package com.pkisi.kdaniel.WebService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresRepo extends CrudRepository<Adres,Integer> {
}
