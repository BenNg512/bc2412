-- this is a comment line
-- MySQLWorkbench is a client slide -> connect -> MySQL Server (7x24)

-- MySQL DBMS -> cases sensitive -- ID == id
create database bootcamp_2412;

use bootcamp_2412;
-- MySQL Server may contains many databases, one database may contains many tables
create table customers(
	id integer,
    first_name varchar(20),
    last_name varchar(20),
    email varchar(50),
    dob date
);
-- * means all column
select * 
from customers;

insert into customers (id, first_name, last_name, email, dob)
values (1,'Vincent', 'Lau', 'vincentlau@gmail.com', '1999-12-31'),
(2,'Ben','Ng', 'benng512@gmail.com', '2000-05-11'),
(3,'Lucas','Lau', 'lucas@gmail.com', '1999-9-9');

-- delete all data in table
delete from customers; 

-- delete by condition
delete from customers
where id = 2 & last_name = 'wong';

-- select is to control column
-- where is to control row
select id, first_name, dob from sutomers where dob < '2000-01-01';

select * from customers where last_name = 'lau' and dob > '1999-12-01';

select * from customers where last_name = 'lau' or first_name = 'Ben';

select * from customers where last_name = 'lau' or first_name = 'Ben' and dob < '1999-12-01';

-- Not equal to: '!=' or '<>'
select * from customers where first_name <> 'Ben';

-- order by (default asc)
select * from customers order by first_name;

-- order by asc <- usually don't write this since it's the same as default
select * from customers order by first_name asc;

-- order by desc
select * from customers order by first_name desc;

select * from customers where dob < '2000-01-01' order by first_name desc;

create table orders(
	id integer,
    amount decimal(13,2), -- 11 for int, 2 for decimal -> 13,2
    order_date datetime,
    customer_id integer
);

drop table orders;

delete from orders; 

insert into orders (id, amount, order_date, customer_id)
values 
(1, 2, '2024-01-22 12:01:01', 1),
(2, 2.0, current_time(), 3),
(3, 3.1, '2020-12-31', 3);

select * from orders;

insert into orders values (4, 9999.9, current_time(), 3);

-- sum(), age(), min(), max(), count() -> aggregate function
select sum(amount) from orders;
select avg(amount) from orders;
select min(amount) from orders;
select max(amount) from orders;
select count(amount) from orders;

-- not ok
select sum(amount), id from orders;

-- ok: all are aggregate
select sum(amount) as total_amt,
	round(avg(amount),2) as avg_amt,
    max(amount) as lowest_amt, 
    min(amount) as highest_amt, 1, 'hello', 
    count(amount) as order_count 
from orders 
where amount > 0;

-- SQL sequences
-- 1. from
-- 2. where
-- 3. group by (HAVING)
-- 4. order by
-- 5. select columns

-- Math
select floor(o.amount), o.* from orders o; -- floor -> round down to nearest int
select ceiling(o.amount), o.* from orders o; -- ceiling -> round up to nearest int
select abs(-4), abs(4) from dual;

-- String
select concat(c.first_name, ' ', c.last_name) as full_name
, length(c.last_name) as last_name_length
, upper(c.first_name) as first_name
, lower(c.last_name) as last_name
, replace(c.email, '@', '$') as new_email
, substring(c.first_name, 1, 1) as first_name_initial
, left(c.first_name, 2) as left_first_name
, right(c.first_name, 2) as right_first_name
, instr(c.first_name, 'V') as firstname_contains_capital_letter_v
, instr(c.first_name, 'v') as firstname_contains_small_letter_v
, c.* from customers c;

-- LIKE
select *
from customers
where first_name like '%v%';
select *
from customers
where first_name like '%V%T';

-- DATE
select o.*, date_add(o.order_date, interval 90 day) as follow_up_date
from orders o;


