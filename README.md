# Springboot-CRUD-API-with-mysql

Mysql Database setup for API:

use mydb;

create table products(
id int auto_increment PRIMARY KEY,
name varchar(20),
description varchar(100),
price decimal(8,3) 
);
