---
YamlDesc: CONTENT-ARTICLE
Title: Java mybatis tutorials
MetaDescription: Java mybatis tutorials
MetaKeywords: Java mybatis tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: mybatis
---

# MyBatis
* MYBATIS is a Java persistence framework that can automate the mapping between 
  Database SQL and Java objects.
* Unlike ORMs, MyBatis does not map Java objects to database tables, But maps 
  Database SQL to but Java objects.
* MyBatis Supports mapping of Database Stored Procedures, Inline SQL 
  and dynamic SQL to java methods.


## Java and Jars details used to create the following MyBatis applications
* MyBatis JAR version:     `mybatis-3.4.6.jar`
* Oracle JDBC JAR Version: `ojdbc8.jar`
* Java Version 1.8


## Components of a MyBatis Application
* A typical MyBatis application has the following file structure
  * **Primary MyBatis configuration XML file**
    * The primary XML configuration file, has DB connection information such as 
      HostName, connection driver, username, password..
    * Details of DataBase Table Mapper XML files
  * **DataBase Table Mapper XML Files**
    * These are have  the DB SQLs statements and DB Call information, We 
      could write a MyBatis application even with out the Mapper XML.
  * Java code POJOs to map to a DataBase Table [Optional]
  * Java Mapper code to handle DB data coming through
  * Java Caller code that uses the, Java Mapper and does some business 
    processing.


## [Non Maven MyBatis-Oracle Annotation Example](annotation-demo-mybatis-oracle.html)
* Here we demonstrate a MyBatis - Oracle application, where we connect to 
  Oracle DB and retrives a single value for various DataTypes.
* In this example we use the Annotation feature to access values from 
  Oracle Database.


## [Non Maven MyBatis-Oracle Mapper Example](mapper-demo-mybatis-oracle.html)
* Here we demonstrate a MyBatis - Oracle application, without using Maven.
  we create a mapper XML that has mappings to Oracle Database tables, 
* Using the mapper xml, which holds the mapping of Oracle DB data data such as
  (tables/built-ins).


## [MyBatis Annotations CRUD]()
*


## [MyBatis Annotations Stored Procedures SQL]()
*


## [MyBatis Annotations RefCursors]()
*


## [MyBatis Annotations Dynamic SQL]()
*


## [MyBatis Mapper XML CRUD]()
*


## [MyBatis Mapper XML Stored Procedures SQL]()
*


## [MyBatis Mapper XML RefCursors]()
*


## [MyBatis Mapper XML Dynamic SQL]()
*

