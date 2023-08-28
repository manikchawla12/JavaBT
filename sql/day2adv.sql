create database db2;
use db2;

create table book(isbn int, bname varchar(20),btype varchar(20),cost float, primary key(isbn));

insert into book values(900001,'java','computer',1200), 
(900002,'typscript','computer',800),
(900003,'Sql','computer',600),
(900004,'two states','literature',250),
(900005,'revolution','literature',500),
(900006,'princess','kids',120), 
(900007,'rabit','kids',601);

select * from book;

-- group by clause

select count(btype),btype,sum(cost), min(cost),max(cost),avg(cost) from book group by btype;
select count(btype),btype,sum(cost), min(cost),max(cost),avg(cost) from book group by btype having btype='computer';
select count(btype),btype,sum(cost), min(cost),max(cost),avg(cost) from book group by btype having count(btype)>=3;
select count(btype),btype,sum(cost), min(cost),max(cost),avg(cost) from book group by btype having sum(cost)<800;