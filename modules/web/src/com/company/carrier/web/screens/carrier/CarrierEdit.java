package com.company.carrier.web.screens.carrier;

import com.haulmont.cuba.gui.screen.*;
import com.company.carrier.entity.Carrier;

@UiController("carrier_Carrier.edit")
@UiDescriptor("carrier-edit.xml")
@EditedEntityContainer("carrierDc")
@LoadDataBeforeShow
public class CarrierEdit extends StandardEditor<Carrier> {
}