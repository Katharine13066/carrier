package com.company.carrier.web.screens.truck;

import com.haulmont.cuba.gui.screen.*;
import com.company.carrier.entity.Truck;

@UiController("carrier_Truck.edit")
@UiDescriptor("truck-edit.xml")
@EditedEntityContainer("truckDc")
@LoadDataBeforeShow
public class TruckEdit extends StandardEditor<Truck> {
}