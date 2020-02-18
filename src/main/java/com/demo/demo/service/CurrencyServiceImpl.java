package com.demo.demo.service;

import com.demo.demo.dao.CurrencyRepository;
import com.demo.demo.model.Currency;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    final  CurrencyRepository currencyRepository;

    public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @Override
    public void save(Currency currency) {
        currencyRepository.save(currency);
    }
}
