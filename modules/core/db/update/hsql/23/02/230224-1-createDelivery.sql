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
);