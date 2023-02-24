create table CARRIER_DELIVERY_GOODS_LINK (
    GOODS_ID varchar(36) not null,
    DELIVERY_ID varchar(36) not null,
    primary key (GOODS_ID, DELIVERY_ID)
);
