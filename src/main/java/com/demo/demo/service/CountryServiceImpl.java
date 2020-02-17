package com.demo.demo.service;

import com.demo.demo.dao.CountryRepository;
import com.demo.demo.model.Country;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService{

    final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public void save(Country country) {
        countryRepository.save(country);
    }
}
