-- begin CARRIER_CARRIER
create table CARRIER_CARRIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COST decimal(19, 2) not null,
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end CARRIER_CARRIER
-- begin CARRIER_INDUSTRIAL_PRODUCTS
create table CARRIER_INDUSTRIAL_PRODUCTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    WEIGHT double precision,
    --
    primary key (ID)
)^
-- end CARRIER_INDUSTRIAL_PRODUCTS
-- begin CARRIER_TRUCK
create table CARRIER_TRUCK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(9) not null,
    CARRIER_ID varchar(36),
    TRUCK_TYPE integer,
    --
    primary key (ID)
)^
-- end CARRIER_TRUCK
-- begin CARRIER_DELIVERY
create table CARRIER_DELIVERY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS_CITY varchar(100),
    ADDRESS_STREET varchar(150),
    ADDRESS_NUMBER_ varchar(9),
    --
    CARRIER_ID varchar(36),
    TRUCK_ID varchar(36),
    DATE_ date,
    DISTANCE double precision,
    --
    primary key (ID)
)^
-- end CARRIER_DELIVERY
-- begin CARRIER_GOODS
create table CARRIER_GOODS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    NAME varchar(150) not null,
    COST decimal(19, 2) not null,
    --
    -- from carrier_FoodStuffs
    EXPIRATION_DATE date,
    --
    primary key (ID)
)^
-- end CARRIER_GOODS
-- begin CARRIER_DELIVERY_GOODS_LINK
create table CARRIER_DELIVERY_GOODS_LINK (
    GOODS_ID varchar(36) not null,
    DELIVERY_ID varchar(36) not null,
    primary key (GOODS_ID, DELIVERY_ID)
)^
-- end CARRIER_DELIVERY_GOODS_LINK
