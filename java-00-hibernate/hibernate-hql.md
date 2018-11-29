---
YamlDesc: CONTENT-ARTICLE
Title: Java Hibernate, HQL
MetaDescription: Java Hibernate, HQL
MetaKeywords: Java Hibernate, HQL
Author: Venkata Bhattaram / tinitiate.com
ContentName: hibernate-hql
---

# Hibernate HQL
* SQL is used to query Database Tables, Hibernate Query Language (HQL) 
  is used to query persistent objects, These Objects are POJO Classes that 
  represent the database tables.
* Behind the scenes the HQL queries are converted into Database SQL.
* HQL is database independent.

## Demonstration of HQL
* Here are the Steps to demonstrate the **Hibernate HQL**
* STEP 1. Tables and Data Setup in Database.
* STEP 2. Create the Table Entity POJO Classes one each for the tables.
* STEP 3. Hibernate Config XML File.
* STEP 4. Demonstration of SQL Select Statements using HQL.
* STEP 5. Demonstration of SQL Insert Update and Delete Statements using HQL.


### STEP 1. Tables and Data Setup in Database
* Here we create 3 tables and demonstrate SQL on these tables.
* We also insert data for testing.
```
-- Drop Tables
drop table projects;
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

-----------------
-- projects Table
-----------------
create table projects (
    project_code  int
   ,empid         int
   ,constraint fk_projects_emp foreign key (empid) references emp (empid)
);

begin
    insert into dept values (1,'IT');
    insert into dept values (2,'ADMIN');
    insert into dept values (3,'TEST');
    commit;
    --
    insert into emp values(1,sysdate-1000,1000.00,1);
    insert into emp values(2,sysdate-1001,2000.00,1);
    insert into emp values(3,sysdate-1002,3000.00,2);
    insert into emp values(4,sysdate-1003,4000.00,2);
    insert into emp values(5,sysdate-1004,5000.00,2);
    insert into emp values(6,sysdate-1005,6000.00,3);
    insert into emp values(7,sysdate-1006,7000.00,3);
    commit;
    --
    insert into projects values(1,1);
    insert into projects values(1,2);
    insert into projects values(1,3);
    insert into projects values(2,4);
    insert into projects values(2,5);
    insert into projects values(2,6);
    insert into projects values(3,4);
    insert into projects values(3,6);
    commit;
end;
```


## STEP 2. Create the Table Entity POJO Classes one each for the tables
### Dept Table's POJO Class
```
package com.tinitiate.hibernate.hql;

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

### Emp Table's POJO Class
```
package com.tinitiate.hibernate.hql;

import java.sql.Date;
import java.util.Set;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "emp")
    private Set<Projects> projects;

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
    

    public Set<Projects> getProjects() {
        return projects;
    }

    public void setProjects(Set<Projects> projects) {
        this.projects = projects;
    }    
}
```

### Projects Table's POJO Class
```
package com.tinitiate.hibernate.hql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECTS")
public class Projects {

    private int project_code;
    private Emp emp;

    // Getters and Setters
    // ===================
    @Id
    @Column(name = "project_code")
    public int getProject_code() {
        return project_code;
    }

    public void setProject_code(int project_code) {
        this.project_code = project_code;
    }

    @ManyToOne
    @JoinColumn(name = "empid")
    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
}
```


### STEP 3. Hibernate Config XML File
```
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-configuration-5.3.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">oracle.jdbc.driver.OracleDriver</property>
        <property name="hibernate.connection.url">jdbc:oracle:thin:@mstin:1521:tinitiate</property>
        <property name="hibernate.connection.username">tiuser</property>
        <property name="hibernate.connection.password">tipasswd</property>
        <property name="hibernate.dialect">org.hibernate.dialect.Oracle12cDialect</property>
        <property name="hibernate.default_schema">tinitiate</property>
        <property name="show_sql">true</property>
        <mapping class="com.tinitiate.hibernate.hql.Dept"/>
        <mapping class="com.tinitiate.hibernate.hql.Emp"/>
        <mapping class="com.tinitiate.hibernate.hql.Projects"/>
    </session-factory>
</hibernate-configuration>
```


### STEP 4. Demonstration of SQL Select Statements using HQL.
```
package com.tinitiate.hibernate.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class HQLSelectStatement {

    public static void main(String[] args) {
        
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("com/tinitiate/hibernate/hql/hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();


        // 1. Select All rows from a table
        // -------------------------------
        String hql1 = "from Dept";

        Query query1 = session.createQuery(hql1);
        List<Dept> deptList1 = query1.list();
         
        for (Dept dept : deptList1) {
            System.out.println(dept.getDeptid() + " " + dept.getDept_name());
        }

        // 2. Select Rows with WHERE condition from a table
        // ------------------------------------------------
        String hql2 = "from Dept where deptid = 1";
        Query query2 = session.createQuery(hql2);
        List<Dept> deptList2 = query2.list();

        for (Dept dept : deptList2) {
            System.out.println(dept.getDeptid());
        }

        // 3. Select with Order By Clause 
        // ------------------------------
        String hql3 = "from Dept order by deptid DESC";
        Query query3 = session.createQuery(hql3);
        List<Dept> deptList3 = query3.list();

        for (Dept dept : deptList3) {
            System.out.println(dept.getDeptid() + " " + dept.getDept_name());
        }

        // 4. Select with Group By Clause 
        // -------------------------------
        // HQL is a object query language, To reference a nested column or 
        // Foreign Key such as EMP.DEPTID we need to refer it using the 
        // Nested <Object>.<Column-Name>
        // Here to access the DeptID from EMP table we have to Use
        // emp.department.deptid
        String hql4 = "select count(1), e.department.deptid from Emp e group by e.department.deptid";
        Query query4 = session.createQuery(hql4);
        List<Object[]> dataSet = query4.list();

        for (Object[] obj : dataSet) {
            Long dept_count = (Long)obj[0];
            int deptid = (int)obj[1];
            System.out.println( dept_count + " " + deptid);
        }

        // 5. INNER JOIN Query Example 
        // ---------------------------
        String hql5 = "from Emp e inner join e.projects";
        Query query5 = session.createQuery(hql5);
        List<Object[]> InJoinSet = query5.list();

        for (Object[] obj : InJoinSet) {
            Emp e = (Emp)obj[0];
            Projects p = (Projects)obj[1];
            System.out.println(e.getEmpid() + " " + p.getProject_code());
        }

        // 6. OUTER JOIN Query Example 
        // ---------------------------
        String hql6 = "select nvl(to_char(p.project_code), 'null') as project_code, nvl(to_char(e.empid), 'null') as empid  from Projects p right outer join p.emp e";
        Query query6 = session.createQuery(hql6);
        List<Object[]> OutJoinSet = query6.list();

        for (Object[] obj : OutJoinSet) {
            String project_code = (String)obj[0];
            String emp_id = (String)obj[1];
            System.out.println(project_code + " " + emp_id);
        }

        // 7. FULL OUTER JOIN Query Example 
        // ---------------------------
        String hql7 = "select nvl(to_char(p.project_code), 'null') as project_code, nvl(to_char(e.empid), 'null') as empid  from Projects p full join p.emp e";
        Query query7 = session.createQuery(hql7);
        List<Object[]> FullOutJoinSet = query7.list();

        for (Object[] obj : FullOutJoinSet) {
            String project_code = (String)obj[0];
            String emp_id = (String)obj[1];
            System.out.println(project_code + " " + emp_id);
        }

        session.close();
        factory.close();
    }
}
```

### STEP 5. Demonstration of SQL Insert Update and Delete Statements using HQL.
```

```


