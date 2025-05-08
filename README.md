Inventory Management System


CREATOR INFORMATION
===================

Bron Whitten


BUILD INFORMATION
=================

Language: Java
GUI: Java Swing Library
Database: MySQL hosted in AWS
Dependencies: Maven
IDE used: NetBeans


OVERVIEW OF SYSTEM
==================

![InventoryManagementSystemPic](https://github.com/user-attachments/assets/96aefc8c-e2a3-4c57-883b-2aebfa84dacc)


This project is a simple inventory management system application for desktop. 
Included in this repository are the .java class files, .form files, pom.xlm, and .ico resources in order to implement this project.

MainWindow.java is the main class inside this program. All of classes branch from this GUI window (frame).
DatabaseUtil.java control most database interactions, but not all. It primarily is for establishing the initial connection and loading the menu table's data.
All other classes are responsible for operating their respective button features to control CRUD control for the inventory's data.
Each class will have some operations that query and manipulate data within the database.
DeleteButtonFrame.java interacts with the interface class to allow deletion of data.
ReportMenuButtonFrame.class directly reports two figures: basic Sales Report information and Low Stock table for inventory alerts.


INSTRUCTIONS ON USE
===================

Upon opening the program, the main window will display the table containing stock items as indicated by the table's label. 
Select any menu button you would like in order to load the appropriate data into the table.
Within each menu option selected, you have the option to "add new", "edit", or "delete"  record which can be selected with the appropriately labeled button. 
It is recommended that you use the "refresh" button after each edit or addition made to keep the table updated. Selecting the appropriate menu button again will also refresh the table.

To ADD a record, select the "add new" button. Then follow the instructions on-screen. Then refresh the table. NOTE: When adding a sale, multiple items can be added to a single sales transaction. Only one purchase order item can be made at a time.

To EDIT a record, select a record in the table and then press the "edit" button. Follow the on-screen instructions. Then refresh the table.

To DELETE a record, select the appropriate record, then select delete, then confirm your deletion. Confirming a deletion will automatically refresh the table. NOTE: Deleting an item from the purchases or sales tables will delete all items in that transaction with the same ID number, not just that individual record.

The reports button will automatically report the most updated data on-screen when selected.


SPECIAL NOTES
=============

This inventory management system will allow for negative stock quantities. This is to allow for pending orders and pre-order.

This project is archived and no longer maintained.

Enjoy!





