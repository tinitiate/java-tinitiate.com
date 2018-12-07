---
YamlDesc: CONTENT-ARTICLE
Title: Java Hibernate Criteria Queries
MetaDescription: Java Hibernate Criteria Queries
MetaKeywords: Java Hibernate Criteria Queries
Author: Venkata Bhattaram / tinitiate.com
ContentName: hibernate-criteria-queries
---

# [Hibernate Criteria Queries](hibernate-criteria-queries.html)
* The Hibernate Criteria Query Language (HCQL) is useful when  a **SELECT**
  statement is issued with a **CRITERIA**.
* Criteria such as `Less Than`, `Greater Than`, `Between`, `isNull` etc.
  on the table rows retreived.
* Hibernate Criteria Queries folder structure
    * ![hibernate criteria queries folder structure](hibernate-cq-folder-structure.png "hibernate criteria queries folder structure")

    
## Demonstration of Hibernate Criteria Queries
* Here are the Steps to demonstrate the **Hibernate Criteria Queries**
* STEP 1. Tables and Data Setup in Database.
* STEP 2. Create the Table Entity POJO Classes one each for the tables.
* STEP 3. Hibernate Config XML File.
* STEP 4. Demonstration of SQL Select with Data Restrictions using Hibernate Criteria Queries.
* STEP 5. Demonstration of SQL Select with Data Sorting using Hibernate Criteria Queries.
* STEP 6. Demonstration of SQL Select with Data Aggregations using Hibernate Criteria Queries.
* STEP 7. Demonstration of SQL Select with Joins using Hibernate Criteria Queries.
* STEP 8. Demonstration of SQL Select with Pagination using Hibernate Criteria Queries.


### STEP 1. Tables and Data Setup in Database.
```
-- Drop Tables
drop table emp;
drop table dept;

-------------------
-- Department Table
-------------------
create table dept (
    deptid     int
   ,dept_name  varchar2(100)
   ,primary key(deptid)
);

-----------------
-- Employee Table
-----------------
create table emp (
    empid       int
   ,join_date   date
   ,sal         number(10,2)
   ,deptid      int
   ,primary key(empid)
   ,constraint fk_dept_emp foreign key (deptid) references dept (deptid)
);

--------------
-- Insert Data
--------------
begin
    insert into dept values (1,'IT');
    insert into dept values (2,'ADMIN');
    insert into dept values (3,'FINANCE');
    commit;
    --
    insert into emp values(1,sysdate-1000,1000.00,1);
    insert into emp values(2,sysdate-1001,2000.00,1);
    insert into emp values(3,sysdate-1002,3000.00,2);
    insert into emp values(4,sysdate-1003,4000.00,2);
    insert into emp values(5,sysdate-1004,5000.00,2);
    insert into emp values(6,sysdate-1005,6000.00,3);
    insert into emp values(7,sysdate-1006,7000.00,3);
    insert into emp values(8,sysdate-1000,1000.00,1);
    insert into emp values(9,sysdate-1001,2000.00,1);
    insert into emp values(10,sysdate-1002,3000.00,2);
    insert into emp values(11,sysdate-1003,4000.00,2);
    insert into emp values(12,sysdate-1004,5000.00,2);
    insert into emp values(13,sysdate-1005,6000.00,3);
    insert into emp values(14,sysdate-1006,7000.00,3);
    commit;
end;
```


### STEP 2. Create the Table Entity POJO Classes one each for the tables.

#### Dept Table's POJO Class
```
package com.tinitiate.hibernate.criteria_queries;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "dept")
public class Dept {

    @Id
    @Column(name = "deptid")
    private int deptid;

    @Column(name = "dept_name")
    private String dept_name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private Set<Emp> emps;

    // Constructors
    // ============
    public Dept() {}
    
    public Dept(int deptid, String dept_name) {
        this.deptid = deptid;
        this.dept_name = dept_name;
    }

    // Getters and Setters
    // ===================
    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }
}
```

#### Emp Table's POJO Class
```
package com.tinitiate.hibernate.criteria_queries;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name = "emp")
public class Emp {
    
    // Primary key Annotation
    @Id
    @Column(name = "empid")
    private int empid;

    @Column(name = "join_date")
    private Date join_date;

    @Column(name = "sal")
    private double sal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deptid", referencedColumnName = "deptid", nullable = false)
    private Dept department;


    // Constructors
    // ============
    public Emp() {}
    
    public Emp(int empid, Date join_date, double sal, Dept department) {
        this.empid = empid;
        this.join_date = join_date;
        this.sal = sal;
        this.department = department;
    }
    
    // Getters and Setters
    // ===================
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
    }
    
    public Dept getdepartment() {
        return this.department;
    }

    public void setdepartment(Dept department) {
        this.department = department;
    }
}
```


### STEP 3. Hibernate Config XML File.
```
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-configuration-5.3.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">oracle.jdbc.driver.OracleDriver</property>
        <property name="hibernate.connection.url">jdbc:oracle:thin:@mst01dat:1521:mscs5tst</property>
        <property name="hibernate.connection.username">int_stg</property>
        <property name="hibernate.connection.password">intstg2014#tst</property>
        <property name="hibernate.dialect">org.hibernate.dialect.Oracle12cDialect</property>
        <property name="hibernate.default_schema">int_stg</property>
        <property name="show_sql">true</property>
        <mapping class="com.tinitiate.hibernate.criteria_queries.Dept"/>
        <mapping class="com.tinitiate.hibernate.criteria_queries.Emp"/>
    </session-factory>
</hibernate-configuration>
```


### STEP 4. Demonstration of SQL Select with Data Restrictions using Hibernate Criteria Queries.
* Restrictions are the conditions applied in a SQL `WHERE` clause, Supported 
  restrictions are
    * `where col < value`
    * `where col <= value`
    * `where col > value`
    * `where col >= value`
    * `where col like value`
    * `where col not like value`
    * `where col between value1 and value2`
    * `where col between value1 and value2`
    * `where col is null` 
    * `where col is not null`
```
package com.tinitiate.hibernate.criteria_queries;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class CQSelectRestrictions {

    public static void main(String[] args) {
        
        // 1. Read Config File
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("com/tinitiate/hibernate/criteria_queries/hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();

        // 2. Create the SessionFactory and Session Object
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();

        // 3. Create the CriteriaBuilder Object 
        CriteriaBuilder builder = session.getCriteriaBuilder();

        // SELECT ALL ROWS
        // ===============
        CriteriaQuery<Dept> DeptQuery = builder.createQuery(Dept.class);
        Root<Dept> rootDept = DeptQuery.from(Dept.class);
        DeptQuery.select(rootDept);
        Query<Dept> DeptQ = session.createQuery(DeptQuery);
        List<Dept> depts = DeptQ.getResultList();

        for (Dept d : depts) { System.out.println(d.getDept_name()); }

        
        // SELECT WITH WHERE CONDITION
        // ===========================
        CriteriaQuery<Emp> EmpQuery = builder.createQuery(Emp.class);
        Root<Emp> rootEmp = EmpQuery.from(Emp.class);
        
        // --------------------------------
        // WHERE EQUALs of SQL Statement
        // --------------------------------
        // SELECT *
        // FROM   emp
        // WHERE  empid = 1;
        // -------------------------------
        EmpQuery.select(rootEmp);                                // SELECT & FROM
        EmpQuery.where(builder.equal(rootEmp.get("empid"), 1));  // WHERE =

        Query<Emp> EmpQ = session.createQuery(EmpQuery);
        List<Emp> Emps = EmpQ.getResultList();

        for (Emp e : Emps)
        { System.out.println(e.getEmpid()  + " " + e.getEmpid() + " " +e.getSal()); }


        // --------------------------------
        // WHERE >= of SQL Statement
        // --------------------------------
        // SELECT *
        // FROM   emp
        // WHERE  sal >= 4000;
        // -------------------------------
        EmpQuery.select(rootEmp);                                               // SELECT & FROM
        EmpQuery.where(builder.greaterThanOrEqualTo(rootEmp.get("sal"), 4000));  // WHERE >=

        EmpQ = session.createQuery(EmpQuery);
        Emps = EmpQ.getResultList();

        for (Emp e : Emps) 
        { System.out.println(e.getEmpid()  + " " + e.getEmpid() + " " +e.getSal()); }


        // --------------------------------
        // WHERE < of SQL Statement
        // --------------------------------
        // SELECT *
        // FROM   emp
        // WHERE  sal < 4000;
        // -------------------------------
        EmpQuery.select(rootEmp);                                   // SELECT & FROM
        EmpQuery.where(builder.lessThan(rootEmp.get("sal"), 4000));  // WHERE <

        EmpQ = session.createQuery(EmpQuery);
        Emps = EmpQ.getResultList();

        for (Emp e : Emps) 
        { System.out.println(e.getEmpid()  + " " + e.getEmpid() + " " +e.getSal()); }


        // -----------------------------
        // WHERE BETWEEN SQL Statement
        // -----------------------------
        // SELECT *
        // FROM   emp
        // WHERE  sal between 1000 and 4000;
        // -------------------------------
        EmpQuery.select(rootEmp);                                                              // SELECT & FROM
        EmpQuery.where(builder.between(rootEmp.get("sal"), 1000, 4000));  // WHERE <

        EmpQ = session.createQuery(EmpQuery);
        Emps = EmpQ.getResultList();

        for (Emp e : Emps)
        { System.out.println(e.getEmpid()  + " " + e.getEmpid() + " " +e.getSal()); }
        

        // --------------------------
        // WHERE LIKE SQL Statement
        // --------------------------
        // SELECT *
        // FROM   emp
        // WHERE  sal between 1000 and 4000;
        // -------------------------------
        CriteriaQuery<Dept> DeptQuery1 = builder.createQuery(Dept.class);
        Root<Dept> rootDept1 = DeptQuery1.from(Dept.class);
        
        DeptQuery1.select(rootDept1);
        DeptQuery1.where(builder.like(rootDept1.get("dept_name"), "%N%"));
        
        Query<Dept> DeptQ1 = session.createQuery(DeptQuery1);
        List<Dept> depts1 = DeptQ1.getResultList();

        for (Dept d : depts1) { System.out.println(d.getDept_name()); }

        session.close();
        factory.close();
    }
}
```


### STEP 5. Demonstration of SQL Select with Data Sorting using Hibernate Criteria Queries.
```

```


### STEP 6. Demonstration of SQL Select with Data Aggregations using Hibernate Criteria Queries.
```
package com.tinitiate.hibernate.criteria_queries;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class CQSelectAggregations {

    public static void main(String[] args) {

        // 1. Read Config File
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("com/tinitiate/hibernate/criteria_queries/hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();

        // 2. Create the SessionFactory and Session Object
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();

        // 3. Create a CriteriaBuilder and CriteriaQuery, Of Object type
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = builder.createQuery(Object.class);

        // 4. Create Root Object for the EMP POJO / Table
        Root<Emp> rootEmp = criteriaQuery.from(Emp.class);

        // *******************
        // AGGREGATE FUNCTIONS
        // *******************

        // COUNT() function
        // ================
        criteriaQuery.select(builder.count(rootEmp));
        Query<Object> query = session.createQuery(criteriaQuery);
        long count = (long)query.getSingleResult();
        System.out.println("Count of Employees = " + count);

        // MAX() function
        // ================
        criteriaQuery.select(builder.max(rootEmp.get("sal")));
        query = session.createQuery(criteriaQuery);
        double max = (double)query.getSingleResult();
        System.out.println("Max Sal in Emp = " + max);

        // MAX() function
        // ================
        criteriaQuery.select(builder.min(rootEmp.get("sal")));
        query = session.createQuery(criteriaQuery);
        double min = (double)query.getSingleResult();
        System.out.println("Max Sal in Emp = " + min);

        // AVG() function
        // ================
        criteriaQuery.select(builder.avg(rootEmp.get("sal")));
        query = session.createQuery(criteriaQuery);
        double avg = (double)query.getSingleResult();
        System.out.println("Max Sal in Emp = " + avg);

        
        session.close();
        factory.close();
    }
}
```


### STEP 7. Demonstration of SQL Select with Joins using Hibernate Criteria Queries.
```

```


### STEP 8. Demonstration of SQL Select with Pagination using Hibernate Criteria Queries.
```

```
