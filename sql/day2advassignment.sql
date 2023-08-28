use db2;
create table patient(patient_id varchar(6) primary key,p_first_name varchar(15),p_middle_name varchar(15),p_last_name varchar(15), address varchar(30), city varchar(15),contact_number varchar(10),p_age int);
insert into patient values(7001,'Aman','preet','verma','D-18','Sirsa',987456123,21);
insert into patient values(7002,'Virat','raj','verma','D-17','Sirsa',987456123,21),(7003,'Manas','raj','Singh','D-15','Sirsa',987456123,21),(7004,'Ankush','raj','preet','D-12','Sirsa',987456123,21);
select * from patient;


create table doctor(doctor_id varchar(6) primary key, dr_first_name varchar(15), dr_middle_name varchar(15),dr_last_name varchar(15));
insert into doctor values(501,'Rajat','kumar','garg');
insert into doctor values(502,'Vikram','kumar','garg'),(503,'Ram','kumar','garg'),(504,'Ram','kumar','garg');
select * from doctor;

create table appointment(app_number varchar(6) primary key,app_data date,app_time varchar(8),app_reason varchar(30), doctor_id varchar(6), patient_id varchar(6), foreign key(patient_id) references patient(patient_id),foreign key(doctor_id) references doctor(doctor_id));
insert into appointment values(60001,current_date(),current_time(),'fever',501,7001);
insert into appointment values(60002,current_date(),current_time(),'Headache',502,7002),(60003,current_date(),current_time(),'fever',503,7003),(60004,current_date(),current_time(),'Pain',504,7004);
select * from appointment;

create table bill(bill_number varchar(6) primary key,bill_date date,bill_status varchar(8),bill_amount int,app_number varchar(6), foreign key(app_number) references appointment(app_number));
insert into bill values(20001,current_date(),'approved',5000,60001);
insert into bill values(20002,current_date(),'approved',3000,60002),(20003,current_date(),'approved',2000,60003),(20004,current_date(),'approved',9000,60004);
select * from bill;

create table payment(payment_id varchar(6) primary key, pay_date date, pay_mode varchar(10), pay_amount int, bill_number varchar(6), foreign key(bill_number) references bill(bill_number));
insert into payment values(30001,current_date(), 'cash', 5000, 20001);
insert into payment values(30002,current_date(), 'cash', 3000, 20002),(30003,current_date(), 'cash', 2000, 20003),(30004,current_date(), 'cash', 9000, 20004);
select * from payment;

select p.patient_id, p.p_first_name,p.p_age, a.app_number, a.app_data from patient p inner join appointment a on p.patient_id=a.patient_id and app_reason='fever' ;
