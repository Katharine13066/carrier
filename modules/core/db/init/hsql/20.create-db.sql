-- begin CARRIER_CARRIER
create unique index IDX_CARRIER_CARRIER_UNIQ_NAME on CARRIER_CARRIER (NAME)^
-- end CARRIER_CARRIER
-- begin CARRIER_TRUCK
alter table CARRIER_TRUCK add constraint FK_CARRIER_TRUCK_ON_CARRIER foreign key (CARRIER_ID) references CARRIER_CARRIER(ID)^
create unique index IDX_CARRIER_TRUCK_UNIQ_NUMBER_ on CARRIER_TRUCK (NUMBER_)^
create index IDX_CARRIER_TRUCK_ON_CARRIER on CARRIER_TRUCK (CARRIER_ID)^
-- end CARRIER_TRUCK
-- begin CARRIER_DELIVERY
alter table CARRIER_DELIVERY add constraint FK_CARRIER_DELIVERY_ON_CARRIER foreign key (CARRIER_ID) references CARRIER_CARRIER(ID)^
alter table CARRIER_DELIVERY add constraint FK_CARRIER_DELIVERY_ON_TRUCK foreign key (TRUCK_ID) references CARRIER_TRUCK(ID)^
create index IDX_CARRIER_DELIVERY_ON_CARRIER on CARRIER_DELIVERY (CARRIER_ID)^
create index IDX_CARRIER_DELIVERY_ON_TRUCK on CARRIER_DELIVERY (TRUCK_ID)^
-- end CARRIER_DELIVERY
-- begin CARRIER_GOODS
create unique index IDX_CARRIER_GOODS_UNIQ_NAME on CARRIER_GOODS (NAME)^
-- end CARRIER_GOODS
-- begin CARRIER_DELIVERY_GOODS_LINK
alter table CARRIER_DELIVERY_GOODS_LINK add constraint FK_DELGOO_ON_GOODS foreign key (GOODS_ID) references CARRIER_GOODS(ID)^
alter table CARRIER_DELIVERY_GOODS_LINK add constraint FK_DELGOO_ON_DELIVERY foreign key (DELIVERY_ID) references CARRIER_DELIVERY(ID)^
-- end CARRIER_DELIVERY_GOODS_LINK
