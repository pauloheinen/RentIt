-- -----------------------------------
-- Database rentitdb
-- -----------------------------------
-- create database rentitdb;

-- -----------------------------------
-- Table employees
-- -----------------------------------
create table employees (
    id int AUTO_INCREMENT not null,
    name varchar (120) not null,
    username varchar (20) not null,
    password varchar (40) not null,
    primary key (id)
);

-- -----------------------------------
-- Table clients
-- -----------------------------------
create table clients (
    id int AUTO_INCREMENT not null,
    name varchar (120) not null,
    email varchar (120) not null,
    phone varchar(11) not null,
    primary key (id)
);

-- -----------------------------------
-- Table vehicles
-- -----------------------------------
create table vehicles (
    id int AUTO_INCREMENT not null,
    vehicle_brand varchar (20) not null,
    vehicle_model varchar (120) not null,
    vehicle_year varchar (4) not null,
    vehicle_plate varchar (10) not null,
    type tinyint not null,
    status tinyint not null,
    primary key (id)
);

-- -----------------------------------
-- Table rents
-- -----------------------------------
create table rents (
    id int AUTO_INCREMENT not null,
    employee_id int not null,
    client_id int not null,
    vehicle_id int not null,
    rent_start_dt date not null,
    rent_end_dt date,
    rent_expected_end_dt date not null,
    rent_value double null,
    status tinyint not null,
    primary key (id),
    FOREIGN KEY (client_id) REFERENCES clients (id),
    FOREIGN KEY (vehicle_id) REFERENCES vehicles (id),
    FOREIGN KEY (employee_id) REFERENCES employees (id)
);