alter table CARRIER_TRUCK add constraint FK_CARRIER_TRUCK_ON_CARRIER foreign key (CARRIER_ID) references CARRIER_CARRIER(ID);
create unique index IDX_CARRIER_TRUCK_UNIQ_NUMBER_ on CARRIER_TRUCK (NUMBER_);
create index IDX_CARRIER_TRUCK_ON_CARRIER on CARRIER_TRUCK (CARRIER_ID);
