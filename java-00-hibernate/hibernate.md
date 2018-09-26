---
YamlDesc: CONTENT-ARTICLE
Title: Java Hibernate
MetaDescription: Java Hibernate
MetaKeywords: Java Hibernate
Author: Venkata Bhattaram / tinitiate.com
ContentName: hibernate
---

# Hibernate ORM
* Hibernate is an open source Java Persistence API, Its also called as an ORM 
  tool, Object Relational Mapping(ORM), this is a mechanism where a Relational 
  Database entity or table is mapped to a Java Object.
* Another way to connect to database from java application is using the JDBC,
  JDBC has limitations due to the connection aspect of the java-database.
* Using JDBC, the Business Logic to the Data retrived from the database 
  cannot be coupled, as there is no support Object level relationship.
* Object Relational Mapping or `ORM` maps a Database Tabel to a Java POJO, 
  this binding enables more complex operations on the data that is 
  retrived from the database in the JAVA application.
* Hibernate also enables to query databases using HQL and SQL, Its easy to work 
  with for non SQL developers.

## Features and Advantages of Hibernate
* Hibernate is an **Open Source framework**
* Hibernate framework **out of the box supports DDL (Create Table), DML (Insert,
  Update, Delete)** operations.
* Hibernate framework is **Database Independent**, it has its own query 
  languange HQL (Hibernate Query Language), unlike JDBC.
* **Hibernate Data Cache**
  * JDBC doesnot support caching, but Hibernate supports dabase data caching.
  * Data Caching reduces the need to make multiple Database calls, thus enhancing
    query or data retrival performance.
  * There are `THREE` types of caching in Hibernate
    * **Session / First Level Cache**
      * Session object are cached at this level
      * This is enabled by default, and cannot be disabled.
      * This cache can be cleared, a few objects or entire cache.
      * Session cache is specfic to a session, other sessions cannot be seen 
        by other sessions.
      * Lifespan of this cache is only until the session lasts, once the 
        session is closed then this cache is closed.
    * **Second Level Cache**
      * This handles caching of database objects across sessions.
      * This is disabled by default, It can be enabled by config.
      * DB Objects are lookedup in the cache first, if not found then they are 
        looked up in the database.
    * **Query Cache**
      * This caches the underlying database tables of a query based on a 
        timestamp and captures data based on the last updated timestamp.
* Hibernate provides, High performance with scalability, by supporting multiple 
  data fetch mechanisms such as; lazy initialization, optimistic locking.


## Hibernate Tutorials
* A basic Hibernate Project requires the following code components
    * Config File
      * This configuration file has the database connection information 
        and schema settings.
    * Database Entity POJO
      * This POJO Class will represent a Table  
    * Session class
      * This is responsible to create a session factory and session objects.
    * Caller Class
      * This is the client program that creates an object to refer to the 
      

### Hibernate Mapping
#### One to One XML Hibernate Mapping
*

#### One to One Annotations Hibernate Mapping
*

#### One to Many XML Hibernate Mapping
*

#### One to Many Annotations Hibernate Mapping
*

#### Many to Many XML Hibernate Mapping
*

#### Many to Many Annotations Hibernate Mapping
*
