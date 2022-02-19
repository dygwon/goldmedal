package com.codecademy.goldmedal.repositories;

import java.util.List;
import java.util.Optional;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Optional<Country> findByName(String name);
    List<Country> findAllByOrderByName();
    List<Country> findAllByOrderByNameDesc();
    List<Country> findAllByOrderByGdp();
    List<Country> findAllByOrderByGdpDesc();
    List<Country> findAllByOrderByPopulation();
    List<Country> findAllByOrderByPopulationDesc();
}