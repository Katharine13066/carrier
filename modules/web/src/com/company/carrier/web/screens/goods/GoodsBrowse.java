package com.company.carrier.web.screens.goods;

import com.haulmont.cuba.gui.screen.*;
import com.company.carrier.entity.Goods;

@UiController("carrier_Goods.browse")
@UiDescriptor("goods-browse.xml")
@LookupComponent("goodsesTable")
@LoadDataBeforeShow
public class GoodsBrowse extends StandardLookup<Goods> {
}