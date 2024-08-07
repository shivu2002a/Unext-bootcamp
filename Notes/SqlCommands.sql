insert into customers values (1, "nandan","H","nandan", "BLR", 10, 'M');
insert into customers values (2, "Shri","A","Shri","BLR", 10, 'M');
insert into customers values (3, "Shreya","S","Shreya","BLR", 10, 'M');
insert into customers values (4, "Sathvik","A","Sathvik", "BLR",10, 'M');
insert into customers values (5, "Vishnu","G","Vishnu", "BLR",10, 'M');
insert into customers values (6, "Sammed","K","Sammed","BLR", 10, 'M');
insert into customers values (7, "kaushik","M","kaushik","BLR", 10, 'M');
insert into customers values (8, "Shivu","L","Shivu" );
insert into customers values (9, "Sahil","N","Sahil" );
insert into customers values (10, "Sagar","O","Sagar" );

insert into orders values (1, 1, 1);
insert into orders values (2, 2, 2);
insert into orders values (3, 3, 3);
insert into orders values (4, 4, 4);
insert into orders values (5, 5, 5);
insert into orders values (6, 6, 6);
insert into orders values (7, 2, 4);
insert into orders values (8, 4, 3);
insert into orders values (9, 5, 3);
insert into orders values (10,6, 7);

Filter before group;
select city, count(*) from customers group by city;
select city, count(*) from customers where customer_id < 6 group by city;
select city, count(*) from customers where customer_id < 6 group by city having count(*) > 2;

Select .....
from .....
where ....
group by .....
having ....
order by ....;

select customer_id, concat(first_name," ", last_name) customer_name from customers order by customer_name desc;

select customer_id, concat(first_name," ", last_name) as customer_name from customers 
where first_name like "Sh%" order by customer_name desc;


CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    manager_id INT,
    FOREIGN KEY (manager_id) REFERENCES employees(emp_id)
);


CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50),
    emp_id INT,
    FOREIGN KEY (emp_id) REFERENCES employees(emp_id)
);

INSERT INTO employees (emp_id, emp_name, manager_id) VALUES 
(1, 'Alice', NULL),
(2, 'Bob', 1),
(3, 'Charlie', 1),
(4, 'Dave', 2);


INSERT INTO departments (dept_id, dept_name, emp_id) VALUES 
(1, 'HR', 1),
(2, 'Engineering', 2),
(3, 'Marketing', NULL),
(4, 'Sales', NULL);

select e1.emp_id, e1.emp_name, e2.emp_name as manager_id from employees e1 
inner join employees e2 on e2.emp_id = e1.manager_id;


-- 1NF A key for every table and no multivalue attribute
-- 2NF Redundant data across multiple rows to a separate table. Resulting tables must be related through keys
-- 3NF Eliminate fields not dependent on PK 

-- Assignment 
