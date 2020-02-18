package com.demo.demo.dao;

import com.demo.demo.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class CountryRepositoryImpl implements CountryRepository {

    @Override
    public <S extends Country> S save(S s) {
        return this.save(s);
    }

    @Override
    public <S extends Country> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Country> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Country> findAll() {
        return null;
    }

    @Override
    public Iterable<Country> findAllById(Iterable<Long> iterable) {
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
    public void delete(Country country) {

    }

    @Override
    public void deleteAll(Iterable<? extends Country> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
