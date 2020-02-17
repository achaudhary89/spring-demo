package com.demo.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long currencyId;

    String currencyCode;

    String description;

    @ManyToMany(mappedBy = "currency")
    Set<Country> country;

    public Set<Country> getCountry() {
        return country;
    }

    public void setCountry(Set<Country> country) {
        this.country = country;
    }

    public long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
