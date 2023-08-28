use db2;

delimiter //

create function addition(a int, b int) returns int
deterministic
begin 
return a+b;
end; //

select addition(11,12);

create table test3(a int, b int);
insert into test3 values(1,2),(8,55),(87,23),(47,61);

select  *, addition (99,22) from test3;

-- procedure without argument

delimiter //
show tables;

create procedure bookinfo()
begin
select avg(cost), min(cost),max(cost) from book;
end;
//

call bookinfo();

-- procedure with argument

delimiter //
show tables;

create procedure bookinfo1(isbn1 int)
begin
select * from book where isbn=isbn1;
end;
//

call bookinfo1(900001);
call bookinfo1(900002);
call bookinfo1(4557574);

select * from book;


-- procedure with argument and outparameter

delimiter //
create procedure bookinfo3(isbn1 int, out bname1 varchar(20), out btype1 varchar(20))
begin
select bname, btype into bname1,btype1 from book where isbn=isbn1;
end;
//

call bookinfo3(900001,@bn,@bcos);
select @bn,@bcos;