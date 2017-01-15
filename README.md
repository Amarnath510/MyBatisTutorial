# MyBatis + Java + Maven Tutorial (CRUD Application)

## Directory Structure
  ![Project directory structure](https://github.com/Amarnath510/MyBatisTutorial/blob/master/MyBatis.png)
  
## Requirements
  - Eclipse
  - Java 8
  - Maven
  - [mysql-connector-java-5.1.15-bin.jar](http://www.java2s.com/Code/Jar/m/Downloadmysqlconnectorjava5115binjar.htm)
  
## Project Setup <br />
  Eclipse -> New -> Maven Project -> Choose "maven-archetype-quickstart" -> Enter GroupId as "com.<orgname>.mybatis" and ArtifactId as "MybatisTutorial" -> Finish.

## Dependencies <br />
  - mybatis dependency.
  - mysql-connector-java dependency.
  - Save "mysql-connector-java-5.1.15-bin.jar" in lib folder and add this folder to the build path. (Right click on project and add a new folder **lib**. Place the jar in this folder. Add this folder to build path.)
  
## Database Configuration Configuration <br />
  - Create a configuration file where we have DB url, username and password details.
  - Include Mapper configuration file here. This Mapper file will have all the queries. Be careful with the path.<br />
  **NOTE:** I have given password here for simplicity.

## Creating Database Mapper
  - The Category Mapper has all the queries where we do mapping of parameters, methods etc.
  - We have all the basic operations and various input types that we send to the queries like,
    - Primitive types (for simple input params like int)
    - Custom Class (Sending class object as parameter)
    - Maps (for sending multiple parameters)
  - We also have different return types like,
    - int
    - List
    - Custom Class
  - We should also have namespace mapped to an interface which has all the methods declared in it. We are writing queries for all the methods in the interface.

## Connection Factory
  - ConnectionFactory creates a SqlSessionFactory using which we will call the database server.
  
## Connection Manager
  - ConnectionManager is the class which actually interacts with the database using the SQL session which we can get from ConnectionFactory.

## Operations
  - Insert (Insert a record. Don't forget to add commit statement after insert.)
  - Delete
  - Update
  - Read (by Id or all)
