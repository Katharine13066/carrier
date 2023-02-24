package com.company.carrier.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CARRIER_TRUCK")
@Entity(name = "carrier_Truck")
public class Truck extends StandardEntity {
    private static final long serialVersionUID = -805387188628648254L;

    @CaseConversion
    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true, length = 9)
    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARRIER_ID")
    private Carrier carrier;

    @Column(name = "TRUCK_TYPE")
    private Integer truckType;

    public TruckType getTruckType() {
        return truckType == null ? null : TruckType.fromId(truckType);
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType == null ? null : truckType.getId();
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}