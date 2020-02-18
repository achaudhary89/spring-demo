package com.demo.demo.dao;

import com.demo.demo.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CountryRepository extends CrudRepository<Country, Long> {
}
