package com.demo.demo.dao;

import com.demo.demo.model.Currency;

import java.util.Optional;

public class CurrencyRepositoryImpl implements CurrencyRepository {
    @Override
    public <S extends Currency> S save(S s) {
        return this.save(s);
    }

    @Override
    public <S extends Currency> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Currency> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Currency> findAll() {
        return null;
    }

    @Override
    public Iterable<Currency> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Currency currency) {

    }

    @Override
    public void deleteAll(Iterable<? extends Currency> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
