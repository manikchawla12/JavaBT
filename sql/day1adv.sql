create database db1; -- create database
show databases; -- show all databases available
use db1; -- using/changing database
show tables; -- show all tables in the database

select user();
select current_date();
select current_time();

select now();

create table student(roll int(6) primary key,name varchar(20), salary float(10,2));
insert into student value(1219206,'Abhishek',252458.5544), 
(1219228,'Chirag',48752.485); -- add multiple records

insert into student(roll,name) values(1219262,'Mayank'); -- add data in specific columns

select roll,name from student where name='Manik';

select roll,name from student where name='Manik' or roll=1219228;

select roll,name from student where name='Manik' and roll=1219262;

select roll,name from student where name='Manik' or roll=1219261;



create table employee(id int auto_increment, name varchar(20),dob date, primary key(id));
insert into employee values(3321, 'Manik', '2001-09-15');

insert into employee(name,dob) values
('Aman','2001-08-31'),
('Rajat','2002-02-04');

select * from employee;

alter table employee add salary float(10,2);
desc employee;
insert into employee(name,dob,salary) values('Nitin','1999-02-27',45841.3551);

alter table employee modify name varchar(50); -- alter modify table

insert into employee(name,dob,salary) values('Ram Pratap singh dash dash','1998-02-27',52841.3551);
insert into employee(name,dob,salary) values('Naman',current_date,0);

alter table employee change id emp_id int;
alter table employee change emps_name emp_name varchar(50);

alter table employee drop column salary;

update employee set emp_name='Aman' where emp_id=3322; 
update employee set emp_name='Vaman', dob='1992-02-9' where emp_id=3326; 

delete from employee where emp_id=3324;

select emp_id as 'Employee ID',emp_name 'Employee Name' from employee; -- use of as to display different name to column
update employee set salary=5243.20 where emp_id=3321;
select emp_id,emp_name,salary,(salary-salary*0.05) as 'gross salary' from employee;

select * from employee where emp_id!=3321;-- all the rows except this one
select * from employee where emp_id<>3321;-- similar to not equal to : donot equal to

select * from employee where emp_id> 3324;

select * from employee where emp_id<3323;

select * from employee where emp_id>3321 and emp_id<3326;

select * from employee where emp_id between 3321 and 3326; -- between is inclusive
select * from student order by salary asc;
select * from student order by salary desc;
select * from student order by salary; -- by default in ascending order


create table garments(id int primary key, name varchar(50) not null unique, cost float not null, check (id>10001 and id<=20000));

insert into garments values(10004,'shirt',210.20),(10005,'pants',2641.20);

insert into garments values(10007,'t-shirt',4841.20);

create table garments2(id int primary key, name varchar(50) not null unique default 'shirt', cost float not null default 0, check (id>10001 and id<=20000));
insert into garments2(id) values(10003);

insert into garments2(id,name,cost) values(10008,'t-shirt',451);

select * from garments2;


create table customer (customer_id int primary key, customer_name varchar(50) not null, age int);

create table customer_product(prd_id int primary key,prd_name varchar(50), cost float, prd_customer_id int, foreign key(prd_customer_id) references customer(customer_id) );

-- adding in parent
insert into customer values(1,'manik',21);
insert into customer values(2,'Ajay',18);

-- adding in child
-- one person with multiple product
insert into customer_product values(201,'shirt',500.20,1);
insert into customer_product values(202,'pant',700.20,1);
insert into customer_product values(203,'t-shirt',800.20,2);
insert into customer_product values(204,'jean',520,2);   

delete from customer_product where prd_customer_id=2; -- to delete anything from parent we firstly must delete data from child table 
delete from customer where customer_id=2;

create table customer_address(adr_id int primary key,city varchar(50), state varchar(20),adr_cust_id int unique, foreign key(adr_cust_id) references customer(customer_id));
-- one person with one address
insert into customer_address values(801,'sirsa','haryana',1);
insert into customer_address values(802,'Chandigarh','haryana',2);

select * from customer_address;

insert into employee values(3327,'Rajat','2002-8-9',5646.2);


-- Distinct
select distinct emp_name from employee;

-- Limit

select * from employee limit 2,3;

-- IN
select * from employee where emp_id=3321 or emp_id=3326;
select * from employee where emp_id in (3325,3327,3321);

-- %

select * from employee where emp_name like 'm%';
select * from employee where emp_name like'%t';
select * from employee where emp_name like '__a%';
select * from employee where emp_name like '%dash%';
select * from employee where emp_name like '%__an';
select * from employee where salary is null;
select * from employee where salary is not null;

select count(*) from employee;
select * from student;
select sum(salary) 'total salary' from student;
select count(*), count(salary), sum(salary) 'total salary', avg(salary) 'average salary', 
min(salary) 'min salary', max(salary) 'maximum salary' from student;

