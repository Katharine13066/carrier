package com.company.carrier.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "CARRIER_GOODS")
@Entity(name = "carrier_Goods")
@NamePattern("%s|name")
public class Goods extends StandardEntity {
    private static final long serialVersionUID = -61142679471971181L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 150)
    private String name;

    @NotNull
    @Column(name = "COST", nullable = false)
    private BigDecimal cost;
    @JoinTable(name = "CARRIER_DELIVERY_GOODS_LINK",
            joinColumns = @JoinColumn(name = "GOODS_ID"),
            inverseJoinColumns = @JoinColumn(name = "DELIVERY_ID"))
    @ManyToMany
    private List<Delivery> deliveries;

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}