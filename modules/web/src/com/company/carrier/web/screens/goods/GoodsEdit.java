package com.company.carrier.web.screens.goods;

import com.haulmont.cuba.gui.screen.*;
import com.company.carrier.entity.Goods;

@UiController("carrier_Goods.edit")
@UiDescriptor("goods-edit.xml")
@EditedEntityContainer("goodsDc")
@LoadDataBeforeShow
public class GoodsEdit extends StandardEditor<Goods> {
}