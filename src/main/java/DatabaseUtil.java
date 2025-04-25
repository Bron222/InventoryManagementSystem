package main.java;

//A utility class for handling the database connection for my IMS

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bron2
 */
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class DatabaseUtil {
    
    //===========================ATTRIBUTES============================================================================
    
    private static Connection connection; //static Connection object to store the active database connection
    private static DefaultTableModel tableModel; //creates table model instance variable
    
    //===========================METHOD-to-connect DB========================================================================
    
    //method to get connection. If connection is open and is there, returns the connection to the method
    public static Connection getConnection() throws SQLException {
        
        //conditions: connection not created or have closed
        if (connection == null || connection.isClosed()) {
            try {
                //loads the MySQL Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //*******DATABASE CONNECTION INFORMATION*********
                String host = "ims-db.c54u40am89s9.us-east-2.rds.amazonaws.com";  // fallback default
                String user = "imsuser";
                String password = "imsStrongP@ss123!";

            String url = "jdbc:mysql://" + host + ":3306/ims_db?useSSL=true&allowPublicKeyRetrieval=true&requireSSL=true&serverTimezone=UTC";
                
                //create a new connection named connection
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Database connected successfully.");
            } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
          
                //for exeption handling if connection fails
            } catch (SQLException e) {
                System.err.println("Failed to connect to database.");
                throw e;
            }
        }
        return connection; //return a connection if there or return created connection
    }
    
    //============================METHOD-to-load-inital-data============================================================
    
    //the program will initially call to load the current stock data prior to any events are executed on screen
    public static DefaultTableModel loadProductsToTable() {
        String[] columnNames = {"Product ID", "Name", "Category", "Price", "Quantity", "Low Stock Alert", 
                                "Description", "Image URL"};
        
        //Creates the default table model
        tableModel = new DefaultTableModel(columnNames, 0) {
            // override the isCellEditable() to prevent editing from the model
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        //select the data to populate from the Products table
        String query = "SELECT product_id, name, category, price, stock_quantity, low_stock_threshold, description, image_url FROM products";
        
         // Execute the query and fetch the results
        try (Connection conn = getConnection(); //uses existing connection
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Iterate through the result set and add data to the table model
            while (rs.next()) {
                // Retrieve data for each column from the ResultSet
                int productId = rs.getInt("product_id");
                String name = rs.getString("name");
                String category = rs.getString("category");
                double price = rs.getDouble("price");
                int stockQuantity = rs.getInt("stock_quantity");
                int stockAlert = rs.getInt("low_stock_threshold");
                String description = rs.getString("description");
                String imageUrl = rs.getString("image_url");
                
                //change price to string for formatting decimal places easily
                String formattedPrice = String.format("$%.2f", price);

                // Add the row to the table model
                tableModel.addRow(new Object[]{productId, name, category, formattedPrice, stockQuantity, 
                                                stockAlert, description, imageUrl});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Return the populated table model
        return tableModel;
    }
    //============================METHOD-to-load-suppliers-data============================================================
    
    //the program will initially call to load the current stock data prior to any events are executed on screen
    public static DefaultTableModel loadSuppliersToTable() {
        String[] columnNames = {"Supplier ID", "Company Name", "Contact Name", "Phone Number", "Email", "Address"};
        
        //Creates the default table model
        tableModel = new DefaultTableModel(columnNames, 0) {
            // override the isCellEditable() to prevent editing from the model
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        //select the data to populate from the Products table
        String query = "SELECT supplier_id, name, contact_name, phone, email, address FROM suppliers";
        
         // Execute the query and fetch the results
        try (Connection conn = getConnection(); //uses existing connection
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Iterate through the result set and add data to the table model
            while (rs.next()) {
                // Retrieve data for each column from the ResultSet
                int supplierId = rs.getInt("supplier_id");
                String name = rs.getString("name");
                String contactName = rs.getString("contact_name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                

                // Add the row to the table model
                tableModel.addRow(new Object[]{supplierId, name, contactName, phone, email, address});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Return the populated table model
        return tableModel;
    }
    //=============================== METHOD-to-load SALES data =======================================================================
    
    // this method loads the sales data need for the Sales Table in the program
    public static DefaultTableModel loadSalesToTable() {
        String[] columnNames = {"Sale Transaction ID", "Product Name", "Product ID", "Quantity Sold", "Projected Subtotal",
                                "Sale Grand Total", "Sale Date", "Sale Item Tracking #"};
        
        //Creates the default table model
        tableModel = new DefaultTableModel(columnNames, 0) {
            // override the isCellEditable() to prevent editing from the model
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        //select the data to populate Sales section from the corresponding DB tables
        String query = """
                        SELECT 
                            salesitems.sale_id,
                            products.name AS product_name,
                            salesitems.product_id,
                            salesitems.quantity,
                            ROUND(products.price * salesitems.quantity, 2) AS unit_price,
                            sales.total_amount,
                            sales.sale_date,
                            salesitems.sale_item_id
                        FROM salesitems
                        JOIN products ON salesitems.product_id = products.product_id
                        JOIN sales ON salesitems.sale_id = sales.sale_id
                        ORDER BY salesitems.sale_id;
                        """;

         // Execute the query and fetch the results
        try (Connection conn = getConnection(); //uses existing connection
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Iterate through the result set and add data to the table model
            while (rs.next()) {
                // Retrieve data for each column from the ResultSet
                int saleId = rs.getInt("sale_id");
                String productName = rs.getString("product_name");
                int productId = rs.getInt("product_id");
                String quantity = rs.getString("quantity");
                double saleSubtotal = rs.getDouble("unit_price");
                double saleGrandTotal = rs.getDouble("total_amount");
                String saleDate = rs.getString("sale_date");
                int trackingNumber = rs.getInt("sale_item_id");
                
                //change price to string for formatting decimal places easily
                String formattedSaleSubtotal = String.format("$%.2f", saleSubtotal);
                String formattedSaleGrandTotal = String.format("$%.2f", saleGrandTotal);

                // Add the row to the table model
                tableModel.addRow(new Object[]{saleId, productName, productId, quantity, 
                                    formattedSaleSubtotal, formattedSaleGrandTotal, saleDate, trackingNumber});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Return the populated table model
        return tableModel;
    }
    //================================== METHOD-to-load PURCHASES data ============================================================
        // this method loads the sales data need for the Sales Table in the program
    public static DefaultTableModel loadPurchasesToTable() {
        String[] columnNames = {"Purchase Order ID", "Product Name", "Product ID", "Quantity Ordered", "Unit Price",
                                "Supplier ID", "Order Grand Total", "Purchase Order Date", "Order Item Tracking #"};
        
        //Creates the default table model
        tableModel = new DefaultTableModel(columnNames, 0) {
            // override the isCellEditable() to prevent editing from the model
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        //select the data to populate Sales section from the corresponding DB tables
        String query = """
                    SELECT 
                        purchaseorderitems.order_id,
                        products.name,
                        purchaseorderitems.product_id,
                        purchaseorderitems.quantity,
                        purchaseorderitems.unit_price,
                                            purchaseorders.supplier_id,
                        purchaseorders.total_amount,
                        purchaseorders.purchase_order_date,
                        purchaseorderitems.order_items_id
                    FROM purchaseorderitems
                    JOIN products ON purchaseorderitems.product_id = products.product_id
                    JOIN purchaseorders ON purchaseorderitems.order_id = purchaseorders.order_id;
                       """
;

         // Execute the query and fetch the results
        try (Connection conn = getConnection(); //uses existing connection
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Iterate through the result set and add data to the table model
            while (rs.next()) {
                // Retrieve data for each column from the ResultSet
                int orderId = rs.getInt("order_id");
                String productName = rs.getString("name");
                int productId = rs.getInt("product_id");
                String quantity = rs.getString("quantity");
                double unitPrice = rs.getDouble("unit_price");
                int supplierId = rs.getInt("supplier_id");
                double purchaseGrandTotal = rs.getDouble("total_amount");
                String purchaseOrderDate = rs.getString("purchase_order_date");
                int orderTrackingNumber = rs.getInt("order_items_id");
                
                //change price to string for formatting decimal places easily
                String formattedUnitPrice = String.format("$%.2f", unitPrice);
                String formattedPurchaseGrandTotal = String.format("$%.2f", purchaseGrandTotal);

                // Add the row to the table model
                tableModel.addRow(new Object[]{orderId, productName, productId, quantity, 
                                    formattedUnitPrice, supplierId, formattedPurchaseGrandTotal, purchaseOrderDate, orderTrackingNumber});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Return the populated table model
        return tableModel;
    }
    
    //============================METHOD-to-close=====================================================================================
    
    //method to close the database connection. NEEDS TO OCCUR AT END OF PROGRAM!!
    public static void closeConnection() {
        //checks if connection is there first
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed successfully.");
                
                //to handle exception if failed
            } catch (SQLException e) {
                e.printStackTrace();
                
                //check this area and ensure if a rethrow needs to happen
            }
        }
    }
}
//=====================================EOF============================================================================================