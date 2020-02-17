package com.demo.demo.service;

import com.demo.demo.model.Country;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {

    public void save(Country country);
}
