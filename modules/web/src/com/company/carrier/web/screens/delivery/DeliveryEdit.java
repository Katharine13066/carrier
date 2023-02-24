package com.company.carrier.web.screens.delivery;

import com.haulmont.cuba.gui.screen.*;
import com.company.carrier.entity.Delivery;

@UiController("carrier_Delivery.edit")
@UiDescriptor("delivery-edit.xml")
@EditedEntityContainer("deliveryDc")
@LoadDataBeforeShow
public class DeliveryEdit extends StandardEditor<Delivery> {
}