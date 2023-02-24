package com.company.carrier.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TruckType implements EnumClass<Integer> {

    NORMAL(10),
    ROAD_TRAIN(20);

    private Integer id;

    TruckType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TruckType fromId(Integer id) {
        for (TruckType at : TruckType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}