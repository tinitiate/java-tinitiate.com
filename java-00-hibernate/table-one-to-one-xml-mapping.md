---
YamlDesc: CONTENT-ARTICLE
Title: Java Hibernate DB Table One to One XML Mapping
MetaDescription: Java Hibernate DB Table One to One XML Mapping
MetaKeywords: Java Hibernate, DB Table, One to One Table, XML Mapping
Author: Venkata Bhattaram / tinitiate.com
ContentName: db-table-one-to-one-xml-mapping
---

# Hibernate DB Table One to One XML Mapping
*
*

## Demonstration of Hibernate DB Table One to One XML Mapping
* STEPS INVOLVED
* STEP 1. Create Oracle DB Tables
* STEP 2. Hibernate Config
* STEP 2. Hibernate DB Table Mapper XML


### Create Oracle Table
* The following tables will be used in Hibernate
* Here we create THREE tables `department` `employee` and `emp_details`
* **DEPARTMENT**  Primary Key deptid
* **EMPLOYEE**     Primary Key empid
* **EMP_DETAILS**  Primary Key empid
```
-- One to One Tables
-- TWO tables with SAME PRIMARY KEY
drop table department;
drop table employee;
drop table emp_details;

create table department (
    deptid     int
   ,dept_name  varchar2(100)
   ,primary key(deptid)
);

create table employee (
    emp_id      int
   ,deptid      int
   ,join_date   date
   ,sal         number(10,2)
   ,primary key(emp_id)
);

create table emp_details (
    emp_id   int
   ,phone    number
   ,address  varchar2(500)
   ,primary key(emp_id)
);

-- Data for Departments table
insert into employee values (1,'Sales');
insert into employee values (2,'IT');

-- Data for Employee table
insert into employee values (1,1,1000);
insert into employee values (2,1,2000);
insert into employee values (3,2,3000);
insert into employee values (4,2,4000);

-- Data for Emp_Details table
insert into emp_details values (1,111111,'11 AAA ave New York');
insert into emp_details values (2,222222,'22 BBB ave Chicago');
insert into emp_details values (3,333333,'33 CCC ave Newark');
insert into emp_details values (4,444444,'44 AAA ave Dallas');

commit;
```


### Java XML Mapper Files
* XML Mapper file for employee
```

```

* XML Mapper file for emp_details
```

```

