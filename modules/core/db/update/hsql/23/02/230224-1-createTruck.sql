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
);