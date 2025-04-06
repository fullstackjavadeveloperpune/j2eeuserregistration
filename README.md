# j2eeuserregistration
J2EE User Registration Full Stack Application

J2EE- Servlet | JSP | JDBC

User Registration-
Full Stack Application

MVC Architecture
M- Model[DAO]
V- View[Presentation]
C- Controller[Business]

Back End- Java | JDK 17 | Servlet | JDBC
Front End- JSP
Database- MySQL

------------------------------------------------------

CREATE DATABASE userdb

USE userdb

CREATE TABLE USER(userid INT, username VARCHAR(255), useraddress VARCHAR(255),
userstate VARCHAR(255), usergender VARCHAR(255), userdob DATE, 
usercontactnumber BIGINT, useremailid VARCHAR(255), userpassword VARCHAR(255),
PRIMARY KEY(userid), UNIQUE KEY(usercontactnumber), UNIQUE KEY(useremailid))

DESC USER

SELECT * FROM USER
