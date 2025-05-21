# Inventory Management System

A desktop-based Inventory Management System built using **Java Swing**, **MySQL**, and **Maven**. Designed for managing products, sales, purchases, and suppliers with a user-friendly GUI and basic reporting tools.

![InventoryManagementSystemPic](https://github.com/user-attachments/assets/96aefc8c-e2a3-4c57-883b-2aebfa84dacc)

## 👤 Creator

**Bron Whitten**  
Developed as part of a software development academic program.  
*This project is archived and no longer actively maintained.*

## 🛠️ Tech Stack

* **Language**: Java (Java 22+)
* **GUI**: Java Swing
* **Build Tool**: Apache Maven
* **Database**: MySQL (hosted remotely via AWS RDS)
* **JDBC Driver**: MySQL Connector/J (managed via Maven)
* **IDE**: NetBeans

## 📁 Project Structure

```
src/
├── main/
│   ├── java/                      # Java source files and .form UI definitions
│   └── resources/                # Icon resources (.ico, .icns)
sql/
├── schema.sql                   # Database table structures (run first)
├── seed.sql                     # Sample data (optional, run after schema)
pom.xml                          # Maven project file
README.md                        # Project documentation
```

## ✅ Features

* Manage products, suppliers, sales, and purchases
* Add, edit, delete records from each category
* Refresh tables for real-time data updates
* Basic reporting on sales and low-stock inventory
* Multi-item support in sales transactions
* Simple and clear Swing-based GUI

## 🧰 Requirements

Make sure the following are installed:

* Java JDK 22+
* Apache Maven
* MySQL Server 8.0+
* NetBeans IDE (recommended for `.form` GUI compatibility)

## ⚙️ Setup Instructions

### 1. Clone the Repository

Clone or download this repository to your local machine.

### 2. Set Up the MySQL Database

Run the schema script to create all necessary tables:

```sql
source sql/schema.sql;
```

(Optional) Run the seed script to populate the database with sample data:

```sql
source sql/seed.sql;
```

### 3. Configure Database Connection

In `DatabaseUtil.java`, update the following values with your own database connection details:

```java
String host = "your_database_host";     // e.g., localhost or your AWS RDS endpoint
String user = "your_username";
String password = "your_password";

String url = "jdbc:mysql://" + host + ":3306/ims_db?useSSL=true&allowPublicKeyRetrieval=true&requireSSL=true&serverTimezone=UTC";
```

Make sure the database name in the URL (`ims_db`) matches the one created by the `schema.sql` file.

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

Run the app from your IDE (launch `MainWindow.java`).

*If you choose to build a `.jar` file for your own distribution, you can run it with:*

```bash
java -jar target/InventoryManagementSystem.jar
```

## 🖥️ How to Use

* The main window displays inventory data in a table.
* Use the top menu buttons to switch between Products, Purchases, Sales, and Suppliers.
* Inside each section:

  * **Add**: Opens a form to insert a new record.
  * **Edit**: Select a record, click edit, modify the data, and save.
  * **Delete**: Select a record and delete it. Deleting a sale or purchase will remove all entries in that transaction.
  * **Refresh**: Reloads the table data.

### 📊 Reports

Click the **Reports** button to view:

* Total sales summary
* Low-stock product alerts

## ⚠️ Special Notes

* Negative stock values are allowed (e.g., for backorders or pre-orders).
* Deleting a sale or purchase deletes all items with the same transaction ID.
* Always click “Refresh” after making changes to update the table.

## 📄 License

This project is provided for educational use and demonstration.

## 📬 Contact

If you found this project useful or have questions, feel free to reach out. Thanks for visiting!
