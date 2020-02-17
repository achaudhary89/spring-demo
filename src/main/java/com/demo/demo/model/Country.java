package com.demo.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long countryId;

    @ManyToMany
    @JoinTable(name = "currency_country", joinColumns = @JoinColumn(name = "countryId"), inverseJoinColumns = @JoinColumn(name = "currencyId"))
    Set<Currency> currency;

    String code;

    String name;

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long id) {
        this.countryId = id;
    }

    public Set<Currency> getCurrency() {
        return currency;
    }

    public void setCurrency(Set<Currency> currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
