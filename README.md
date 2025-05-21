# Inventory Management System

A desktop-based Inventory Management System built using **Java Swing**, **MySQL**, and **Maven**. Designed for managing products, sales, purchases, and suppliers with a user-friendly GUI and basic reporting tools.

![InventoryManagementSystemPic](https://github.com/user-attachments/assets/96aefc8c-e2a3-4c57-883b-2aebfa84dacc)

## 👤 Creator

**Bron Whitten**  
Developed as part of a software development academic program.  
_This project is archived and no longer actively maintained._

## 🛠️ Tech Stack

- **Language**: Java (Java 22+)  
- **GUI**: Java Swing  
- **Build Tool**: Apache Maven  
- **Database**: MySQL (hosted remotely via AWS RDS)  
- **JDBC Driver**: MySQL Connector/J (managed via Maven)  
- **IDE**: NetBeans  

## 📁 Project Structure

```
src/
├── main/
│   ├── java/                      # Java source files and .form UI definitions
│   └── resources/                # Icon resources (.ico, .icns)
├── sql/
│   ├── schema.sql                # (You must add this file)
│   └── seed.sql                  # (Optional: Add sample data here)
├── pom.xml                       # Maven project file
├── README.md                     # Project documentation
```

## ✅ Features

- Manage products, suppliers, sales, and purchases  
- Add, edit, delete records from each category  
- Refresh tables for real-time data updates  
- Basic reporting on sales and low-stock inventory  
- Multi-item support in sales transactions  
- Simple and clear Swing-based GUI  

## 🧰 Requirements

Make sure the following are installed:

- Java JDK 22+  
- Apache Maven  
- MySQL Server 8.0+  
- NetBeans IDE (recommended for `.form` GUI compatibility)

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/inventory-management-system.git
cd inventory-management-system
```

### 2. Set Up the MySQL Database

Create a new database (e.g., `ims_db`) using MySQL Workbench or the command line.  
Then run the contents of `sql/schema.sql` to create the required tables.

### 3. Configure Database Connection

In `DatabaseUtil.java`, update your database credentials:

```java
String url = "jdbc:mysql://your-db-host:3306/ims_db";
String user = "your_username";
String password = "your_password";
```

Alternatively, use a `db.properties` file and load it with `Properties` in Java for better flexibility.

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

Run the app from your IDE (launch `MainWindow.java`)  
Or, if you've built a JAR:

```bash
java -jar target/InventoryManagementSystem.jar
```

## 🖥️ How to Use

- The main window displays inventory data in a table.
- Use the top menu buttons to switch between Products, Purchases, Sales, and Suppliers.
- Inside each section:
  - **Add**: Opens a form to insert a new record.
  - **Edit**: Select a record, click edit, modify the data, and save.
  - **Delete**: Select a record and delete it. Deleting a sale or purchase will remove all entries in that transaction.
  - **Refresh**: Reloads the table data.

### 📊 Reports

Click the **Reports** button to view:
- Total sales summary
- Low-stock product alerts

## ⚠️ Special Notes

- Negative stock values are allowed (e.g., for backorders or pre-orders).
- Deleting a sale or purchase deletes all items with the same transaction ID.
- Always click “Refresh” after making changes to update the table.

## 📦 Optional Enhancements

- Add `schema.sql` to the `/sql` folder to define all required database tables.
- Add `seed.sql` for inserting sample data.
- Upload a `.jar`, `.exe`, or installer in the GitHub Releases tab.
- Include application screenshots in a `/screenshots` folder and embed them in this README.
- Add a LICENSE file (MIT is a common default).

## 📄 License

This project is provided for educational use and demonstration.  
If you wish to open-source it, you can add a LICENSE file.

## 📬 Contact

If you found this project useful or have questions, feel free to fork it or open an issue. Thanks for visiting!
