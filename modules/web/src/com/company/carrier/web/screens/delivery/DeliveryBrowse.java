package com.company.carrier.web.screens.delivery;

import com.haulmont.cuba.gui.screen.*;
import com.company.carrier.entity.Delivery;

@UiController("carrier_Delivery.browse")
@UiDescriptor("delivery-browse.xml")
@LookupComponent("deliveriesTable")
@LoadDataBeforeShow
public class DeliveryBrowse extends StandardLookup<Delivery> {
}