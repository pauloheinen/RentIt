
-- -----------------------------------
-- Database rentitdb
-- -----------------------------------
create database rentitdb;

-- -----------------------------------
-- Table employees
-- -----------------------------------
create table employees (
	id int not null AUTO_INCREMENT,
	name varchar (120) not null,
	username varchar (20) not null,
	password varchar (40) not null,
	type tinyint not null,
	primary key (id)
);

-- -----------------------------------
-- Table clients
-- -----------------------------------
create table clients (
	id int NOT NULL AUTO_INCREMENT,
	name varchar (120) not null,
	email varchar (120) not null,
	phone int not null,
	type tinyint not null,
	primary key (id)
);

-- -----------------------------------
-- Table vehicles
-- -----------------------------------
create table vehicles (
	id int NOT NULL AUTO_INCREMENT,
	vehicle_brand varchar (20) not null,
	vehicle_model varchar (120) not null,
	vehicle_year date not null,
	vehicle_plate varchar (10) not null,
	type tinyint not null,
	status boolean not null,
	primary key (id)
);

-- -----------------------------------
-- Table rents
-- -----------------------------------
create table rents (
	id int NOT NULL AUTO_INCREMENT,
	client_id int not null,
	vehicle_id int not null,
	rent_start_dt datetime not null,
	rent_end_dt datetime not null,
	rent_expected_end_dt datetime not null,
	rent_value double null,
	rent_value_fine double null,
	status tinyint not null,
	primary key (id),
	CONSTRAINT fk_client_id
    	FOREIGN KEY (client_id)
    	REFERENCES clients (id),
    CONSTRAINT fk_vehicle_id
    	FOREIGN KEY (vehicle_id)
    	REFERENCES vehicles (id)
);