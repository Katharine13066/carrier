package com.company.carrier.web.screens.truck;

import com.haulmont.cuba.gui.screen.*;
import com.company.carrier.entity.Truck;

@UiController("carrier_Truck.browse")
@UiDescriptor("truck-browse.xml")
@LookupComponent("trucksTable")
@LoadDataBeforeShow
public class TruckBrowse extends StandardLookup<Truck> {
}