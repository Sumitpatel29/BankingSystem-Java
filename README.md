
# BankingSystem using Java


Software Prerequisite:

MySQL: MySQL is a full-featured relational database management system (RDBMS) that uses Structured Query Language (SQL). It is known for its speed, reliability, and flexibility.
Eclipse: Eclipse is an Integrated Development Environment (IDE) primarily used for developing and debugging Java code. It provides a base workspace and an extensible plug-in system for customizing the environment.
Database Setup:

Step 1: Create a database named bank.
Step 2: Create a table named customer within the bank database to store customer information. The table contains columns for account number, customer name, balance, and password.

//code for database creation

CREATE DATABASE BANK;

CREATE TABLE `customer` (
  `ac_no` int NOT NULL AUTO_INCREMENT,
  `cname` varchar(45) DEFAULT NULL,
  `balance` varchar(45) DEFAULT NULL,
  `pass_code` int DEFAULT NULL,
  PRIMARY KEY (`ac_no`),
  UNIQUE KEY `cname_UNIQUE` (`cname`)
);

Eclipse Project Setup:

Create New Project: Set up a new Java project in Eclipse.
Create a Package: Create a package named banking within the project.
File Configuration:

Connection Class: Create a Connection class within the banking package to establish a connection to the MySQL database. This class includes methods for retrieving and managing the database connection.

Purpose: The Connection class provides a global database connection object that is used to execute database commands.

Implementation: The class includes methods for obtaining a database connection using the MySQL JDBC driver and credentials.


//-----------------------------------------------------------------------//


Bank Management Class: Create a bankManagement class within the banking package to handle banking operations such as creating accounts, logging in, transferring money, and fetching account balances.

Purpose: This class encapsulates the functionality related to bank management operations.

Implementation: The class includes methods for creating accounts, logging in, transferring money between accounts, and retrieving account balances.

//-----------------------------------------------------------------------//


User Menu Class: Create a bank class within the banking package to provide a menu-driven interface for users to interact with the banking system.

Purpose: The bank class serves as the entry point for users to access banking functionalities.

Implementation: The class includes a main method that displays a menu for creating accounts, logging in, and performing other banking operations based on user input.


Output:
The project provides a user-friendly interface for customers to interact with the banking system. Users can create accounts, log in, transfer money between accounts, and view account balances through a menu-driven interface.


## Screenshots

![Screenshot 2024-04-21 134311](https://github.com/Sumitpatel29/BankingSystem-Java/assets/62977218/79444c3f-b7df-4887-b963-222689bc8277)

//-----------------------------------------------------------------------//

![Screenshot 2024-04-21 134414](https://github.com/Sumitpatel29/BankingSystem-Java/assets/62977218/392857bc-c797-4ee1-931a-cfbef8dd10b5)



