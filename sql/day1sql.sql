-- use sakila;
-- select * from actor;
-- create database mydb;
use mydb;
create table if not exists newauthor(id varchar(8) not null,name varchar(20) not null,country varchar(25) not null check(country in ('usa','uk','india')),
city varchar(25) not null, primary key (id,city));
insert into newauthor values(2,'aman','usa','new york');
alter table newauthor modify primary key (id);
select * from newauthor;
