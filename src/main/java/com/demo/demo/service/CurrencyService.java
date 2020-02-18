package com.demo.demo.service;

import com.demo.demo.model.Currency;
import org.springframework.stereotype.Service;

@Service
public interface CurrencyService {

    public void  save(Currency currency);
}
