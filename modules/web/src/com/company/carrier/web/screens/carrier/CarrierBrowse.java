package com.company.carrier.web.screens.carrier;

import com.haulmont.cuba.gui.screen.*;
import com.company.carrier.entity.Carrier;

@UiController("carrier_Carrier.browse")
@UiDescriptor("carrier-browse.xml")
@LookupComponent("carriersTable")
@LoadDataBeforeShow
public class CarrierBrowse extends StandardLookup<Carrier> {
}