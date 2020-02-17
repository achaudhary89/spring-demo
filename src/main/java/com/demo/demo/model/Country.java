package com.demo.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToMany
    Set<Currency> currency;

    String code;

    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
