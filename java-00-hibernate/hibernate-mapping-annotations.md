---
YamlDesc: CONTENT-ARTICLE
Title: Java Hibernate Example
MetaDescription: Java Hibernate mapping annotations Example
MetaKeywords: Java Hibernate mapping annotations Example
Author: Venkata Bhattaram / tinitiate.com
ContentName: hibernate mapping annotations example
---

# Hibernate Database Table Mapping with Annotations
* This example demonstrates, using Hibernate to perform CRUD operations on a 
  Table using the annotations mapping.
* Make sure The Oracle JDBC Jar and Hibernate Jars are added to the project 
  jars used in this project. 
    * ![hibernate mapping jar files](hibernate-mapping-jar-files.png "hibernate mapping jar files")
* Steps Create this Hibernate Example
* Create the Database table for this example
* Project Structure and Files explained
* A basic Hibernate Project requires the following code components
  * **Hibernate Config File**
    * This configuration file has the database connection information and 
      schema settings.
  * **Database Entity POJO**
    * This POJO Class will represent the database table/entitity
  * **Session class**
    * This is responsible to create a session factory and session objects.
    * This has the DB Operations, CRUD using Hibernate.
* Project Folder Structure for this example
  * ![hibernate mapping annotation folder structure](hibernate-mapping-annotation-folder-structure.png "hibernate mapping annotation folder structure")


## STEP 1. Database Table
* The **departments** Table DDL, this will be used in this Hibernate Example
```
-- Drop Tables
drop table department;

-- Department Table
create table department (
    deptid     int
   ,dept_name  varchar2(100)
   ,primary key(deptid)
);
```

## STEP 2. Hibernate Config File
* This configuration file has the database connection information and 
  schema settings.
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
        <mapping class="com.tinitiate.hibernate.mapping.annotation.Department"/>
    </session-factory>
</hibernate-configuration>

```

## STEP 3. Database Entity POJO
* This POJO Class will represent the database table/entitity
* This POJO has the Annotations to Specify the Table (Entity), the columns and 
  the Primary key.
```
package com.tinitiate.hibernate.mapping.annotation;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @Column(name = "deptid")
    private int deptid;

    @Column(name = "dept_name")
    private String dept_name;

    public Department() {}

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
}
```

## STEP 4. Session class
* This is responsible to create a session factory and session objects.
* This has the DB Operations, CRUD using Hibernate, with Mapping Annotations
```
package com.tinitiate.hibernate.mapping.annotation;
 
import java.util.List;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;


public class DepartmentCRUD {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("com/tinitiate/hibernate/mapping/annotation/hibernate.cfg.xml");
        configuration.addAnnotatedClass(Department.class);
        ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory factory = configuration.buildSessionFactory(srvcReg);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Department d1;
        try {
            // ============
            // Insert Rows
            // ============
            // Create New Rows
            d1 = new Department();
            d1.setDeptid(1);
            d1.setDept_name("I.T");
            session.save(d1);

            d1 = new Department();
            d1.setDeptid(2);
            d1.setDept_name("Sales");
            session.save(d1);

            d1 = new Department();
            d1.setDeptid(3);
            d1.setDept_name("Marketing");
            session.save(d1);

            d1 = new Department();
            d1.setDeptid(4);
            d1.setDept_name("Finance");
            session.save(d1);


            // =============
            // GET All Rows
            // =============
            Query query = session.createQuery("from Department");
            List<Department> LD1 = query.list();

            for (int i=0; i < LD1.size(); i++)
                System.out.println(LD1.get(i).getDeptid() + " " + LD1.get(i).getDept_name());


            // ===================
            // Update Existing Row
            // ===================
            // 1. Get the existing row
            d1 = new Department();
            d1 = session.get(Department.class, 1);

            // 2. Set new value
            d1.setDept_name("Information Technology");

            // 3. Save Data
            session.update(d1);


            // =============
            // GET All Rows
            // =============
            query = session.createQuery("from Department");
            LD1 = query.list();

            for (int i=0; i < LD1.size(); i++)
                System.out.println(LD1.get(i).getDeptid() + " " + LD1.get(i).getDept_name());


            // ===================
            // Delete Existing Row
            // ===================
            // 1. Get the existing row
            d1 = new Department();
            d1 = session.get(Department.class, 4);
            session.delete(d1);

            // Commit the Changes to the Database
            tx.commit();

            // =============
            // GET All Rows
            // =============
            query = session.createQuery("from Department");
            LD1 = query.list();

            for (int i=0; i < LD1.size(); i++)
                System.out.println(LD1.get(i).getDeptid() + " " + LD1.get(i).getDept_name());


        } catch(Exception e) {
            if (tx.isActive()) { tx.rollback(); }
            throw e;
        }
        finally {
            factory.close();
            session.close();
        }
    }
}
```
