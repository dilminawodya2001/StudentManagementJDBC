# Student Management System (Java + JDBC)

A simple **console-based Java application** using **JDBC + MySQL** for managing student records (CRUD operations).

---

## 📦 Setup Instructions

### 1. Database Setup
1. Open MySQL (Workbench / CLI / phpMyAdmin).
2. Run the following SQL:

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(100),
    age INT,
    course VARCHAR(50),
    department VARCHAR(50)
);
```
## 2. Project Setup

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/student-management-jdbc.git
    ```
2.Open in IntelliJ IDEA.

3.Add MySQL JDBC Driver dependency:

    Go to: File → Project Structure → Libraries → + → From Maven
    
    Search: mysql:mysql-connector-java:8.0.33 (or latest version).

4.Update DB credentials in DBConnection.java

```java
private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
private static final String USER = "root"; // your DB username
private static final String PASSWORD = ""; // your DB password
```
5.Run Main.java.

## 3. ▶️ Usage

The program shows a menu:

--- Student Management ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

Add, view, update, or delete students from the database.

In Update, you can choose which field (name, email, age, course, department) to modify.

## 4. 📌 Notes / Assumptions

Database must be running on localhost:3306.

Tested with MySQL 8.0 and Java 11+.

Simple console-based app → no GUI.
