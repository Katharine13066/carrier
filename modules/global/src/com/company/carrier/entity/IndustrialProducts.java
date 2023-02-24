package com.company.carrier.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CARRIER_INDUSTRIAL_PRODUCTS")
@Entity(name = "carrier_IndustrialProducts")
public class IndustrialProducts extends StandardEntity {
    private static final long serialVersionUID = 1465844768998150328L;

    @Column(name = "WEIGHT")
    private Double weight;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}