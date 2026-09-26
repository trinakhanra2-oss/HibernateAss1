## **Hibernate E-Commerce**



###### A simple e-commerce application developed using Java, Hibernate ORM, JPA, Maven, and MySQL. The project demonstrates entity mapping, relationships, database connectivity, and order creation using Hibernate ORM.



### **Technologies Used**

* ###### Java 8
* ###### Hibernate ORM 6.3.1.Final
* ###### JPA (Jakarta Persistence)
* ###### MySQL 8.0
* ###### Maven
* ###### JUnit 3.8.1
* ###### Eclipse IDE

### **Entities**



###### The project contains the following entities:

###### 

* ###### Category
* ###### Product
* ###### Users
* ###### Orders
* ###### OrderDetails



### **Entity Relationships**

* ###### One Category can have many Products.
* ###### Many Products belong to one Category.
* ###### One User can have many Orders.
* ###### Many Orders belong to one User.
* ###### One Order can have many OrderDetails.
* ###### Many OrderDetails belong to one Order.
* ###### Many OrderDetails can refer to one Product.

### **Features**

* ###### Hibernate ORM configuration
* ###### MySQL database connectivity
* ###### JPA entity mapping using annotations
* ###### Auto-generated primary keys
* ###### Unique and non-null constraints
* ###### One-to-Many and Many-to-One relationships
* ###### Lazy fetching strategy
* ###### Cascade operations for User → Orders and Order → OrderDetails
* ###### Creation of an Order with multiple OrderDetails
* ###### Fetching existing Users and Products from the database
* ###### Hibernate SessionFactory management
* ###### Maven project configuration



### **Project Structure**

###### HibernateAss1

###### ├── src

###### │   ├── main

###### │   │   ├── java

###### │   │   │   └── com.code.HibernateAss1

###### │   │   │       ├── App.java

###### │   │   │       ├── HibernateUtil.java

###### │   │   │       └── entity

###### │   │   │           ├── Category.java

###### │   │   │           ├── OrderDetails.java

###### │   │   │           ├── Orders.java

###### │   │   │           ├── Product.java

###### │   │   │           └── Users.java

###### │   │   │

###### │   │   └── resources

###### │   │       └── hibernate.cfg.xml

###### │   │

###### │   └── test

###### │       └── java

###### │           └── com.code.HibernateAss1

###### │               └── AppTest.java

###### │

###### ├── pom.xml

###### └── target





### **Database Setup**

###### 1\. Install MySQL: 

###### &#x20;      Install and start MySQL Server on your system.

###### 

###### 2\. Create the Database

###### &#x20;      Create the database using: CREATE DATABASE ecommerce\_db;

###### 3\. Configure Hibernate

###### &#x20;      The project uses: src/main/resources/hibernate.cfg.xml

###### 

###### The configuration contains the MySQL database connection details:

###### 

###### <property name="connection.driver\_class">

###### &#x20;   com.mysql.cj.jdbc.Driver

###### </property>

###### 

###### <property name="connection.url">

###### &#x20;   jdbc:mysql://localhost:3307/ecommerce\_db

###### </property>

###### 

###### <property name="connection.username">

###### &#x20;   root

###### </property>

###### 

###### <property name="connection.password">

###### &#x20;   YOUR\_PASSWORD

###### </property>

###### 

###### Change the username, password, port, and database name according to your MySQL configuration.



### **Hibernate Configuration**



###### Hibernate is configured to automatically update the database tables using:

###### 

###### <property name="hibernate.hbm2ddl.auto">

###### &#x20;   update

###### </property>

###### 

###### SQL queries are displayed in the console using:

###### 

###### <property name="show\_sql">

###### &#x20;   true

###### </property>

### **Running the Project**

###### Using Eclipse

1. ###### Import the project as a Maven Project.
2. ###### Make sure MySQL Server is running.
3. ###### Create the ecommerce\_db database.
4. ###### Check the database details in hibernate.cfg.xml.
5. ###### Right-click the project.
6. ###### Select Maven → Update Project.
7. ###### Run App.java as a Java Application.



### **Application Flow**



###### The application performs the following operations:

###### 

1. ###### Creates the Hibernate SessionFactory.
2. ###### Opens a Hibernate session.
3. ###### Starts a database transaction.
4. ###### Fetches an existing User with ID 1.
5. ###### Fetches an existing Product with ID 1.
6. ###### Creates a new Order.
7. ###### Creates two OrderDetails for the order.
8. ###### Associates the OrderDetails with the Order and Product.
9. ###### Persists the Order and its OrderDetails.
10. ###### Commits the transaction.
11. ###### Displays the generated Order ID, total amount, and number of order details.

### **Example Output**

###### =================================

###### Order created successfully!

###### Order ID: 1

###### Total Amount: 110000.00

###### Order Details: 2

###### =================================

###### Hibernate session closed.

###### 

###### The actual Order ID may be different depending on the database.



### **JPA Mappings**

##### Category

###### Category

###### &#x20;  │

###### &#x20;  │ One-to-Many

###### &#x20;  ▼

###### Product

##### Users and Orders

###### Users

###### &#x20;  │

###### &#x20;  │ One-to-Many

###### &#x20;  ▼

###### Orders

##### Orders and OrderDetails

###### Orders

###### &#x20;  │

###### &#x20;  │ One-to-Many

###### &#x20;  ▼

###### OrderDetails

##### Product and OrderDetails

###### Product

###### &#x20;  ▲

###### &#x20;  │ Many-to-One

###### &#x20;  │

###### OrderDetails



### **Main Classes**

###### App.java: Contains the main application logic for creating an Order with multiple OrderDetails.

###### 

###### HibernateUtil.java: Creates and manages the Hibernate SessionFactory and registers all entity classes.

###### 

###### Category.java: Represents product categories with a unique category name and description.

###### 

###### Product.java: Represents products with name, price, stock quantity, and category information.

###### 

###### Users.java: Represents users with username, password, email, role, and associated orders.

###### 

###### Orders.java: Represents customer orders with order date, total amount, user, and order details.

###### 

###### OrderDetails.java: Represents individual items in an order with quantity, unit price, order, and product.



### **Maven Dependencies**



###### The project uses:

###### 

###### Hibernate Core 6.3.1.Final

###### MySQL Connector/J 8.0.33

###### JUnit 3.8.1

###### 

###### All dependencies are managed through pom.xml.



##### **Important Note About Database Credentials**



###### The hibernate.cfg.xml file contains database connection credentials.

###### 

###### For a public GitHub repository, do not upload your real MySQL password.

###### 

###### It is recommended to:

###### 

###### Create a hibernate.cfg.example.xml containing placeholder credentials.

###### Add the actual hibernate.cfg.xml to .gitignore.

###### Keep your real database password only in your local project.

###### 

###### Example:

###### 

###### hibernate.cfg.xml

###### 

###### Add it to .gitignore if it contains your real password.

###### 

### **Future Improvements**



###### The project can be extended with:

###### 

* ###### Complete CRUD operations for all entities
* ###### Password hashing using a secure password-hashing algorithm
* ###### Dedicated JUnit tests for CRUD operations
* ###### Database schema file (schema.sql)
* ###### Product and category management
* ###### Order retrieval and reporting
* ###### Better exception handling
* ###### Environment-based database configuration
* ###### REST API integration



#### **Author**



###### Trina Khanra

