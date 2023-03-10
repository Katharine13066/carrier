package com.company.carrier.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@MetaClass(name = "carrier_Address")
@Embeddable
public class Address extends EmbeddableEntity {
    private static final long serialVersionUID = -5469493094427990144L;

    @Column(name = "CITY", length = 100)
    private String city;

    @Column(name = "STREET", length = 150)
    private String street;

    @Column(name = "NUMBER_", length = 9)
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}