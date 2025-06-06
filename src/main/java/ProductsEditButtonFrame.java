package main.java;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bron2
 */
public class ProductsEditButtonFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProductsEditButtonFrame
     */
    private int productId; //used for querying DB accurately
    
    public ProductsEditButtonFrame(String productId, String productName, String category, String price, String stockQuantity,
                                            String stockAlert, String description, String imageUrl) {
        
        initComponents();
        
        
        this.productId = Integer.parseInt(productId); //stores the productId as an Integer
        
        //the constructor passes the data from the selected record of MainWindow to populate labels
        productNameTextField.setText(productName);
        categoryTextField.setText(category);
        priceTextField.setText(price);
        stockQuantityTextField.setText(stockQuantity);
        stockAlertTextField.setText(stockAlert);
        descriptionTextField.setText(description);
        imageTextField.setText(imageUrl);
    }    
    public ProductsEditButtonFrame() {
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormBody = new javax.swing.JPanel();
        productNameTextField = new javax.swing.JTextField();
        categoryTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        stockQuantityTextField = new javax.swing.JTextField();
        stockAlertTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        imageTextField = new javax.swing.JTextField();
        productNameLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        stockQuantityLabel = new javax.swing.JLabel();
        stockAlertLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        topMessageLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit a Product");

        priceTextField.setText("$0.00");

        stockQuantityTextField.setText("0");

        stockAlertTextField.setText("5");

        productNameLabel.setText("Product name:");

        categoryLabel.setText("Category:");

        priceLabel.setText("Price:");

        stockQuantityLabel.setText("Stock quantity:");

        stockAlertLabel.setText("Stock alert threshold:");

        descriptionLabel.setText("Description:");

        imageLabel.setText("image URL:");

        javax.swing.GroupLayout jPanelFormBodyLayout = new javax.swing.GroupLayout(jPanelFormBody);
        jPanelFormBody.setLayout(jPanelFormBodyLayout);
        jPanelFormBodyLayout.setHorizontalGroup(
            jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productNameLabel)
                    .addComponent(categoryLabel)
                    .addComponent(priceLabel)
                    .addComponent(stockQuantityLabel)
                    .addComponent(stockAlertLabel)
                    .addComponent(descriptionLabel)
                    .addComponent(imageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageTextField)
                    .addComponent(productNameTextField)
                    .addComponent(stockAlertTextField)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(stockQuantityTextField)
                    .addComponent(priceTextField)
                    .addComponent(categoryTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormBodyLayout.setVerticalGroup(
            jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormBodyLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockQuantityLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockAlertTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockAlertLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageLabel))
                .addGap(18, 18, 18))
        );

        topMessageLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        topMessageLabel.setText("Please fill out the boxes below to edit the product.");

        submitButton.setBackground(new java.awt.Color(153, 220, 255));
        submitButton.setText("Submit Changes");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(submitButton)
                .addGap(52, 52, 52)
                .addComponent(cancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPanelFormBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 168, Short.MAX_VALUE)
                .addComponent(topMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(topMessageLabel)
                .addGap(18, 18, 18)
                .addComponent(jPanelFormBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        
        this.dispose(); //closes this window only
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
         //adds the textFields data to variables for SQL input
        String name = productNameTextField.getText().strip();
        String category = categoryTextField.getText().strip();
        String priceText = priceTextField.getText().strip();
        String quantityText = stockQuantityTextField.getText().strip();
        String stockAlertText = stockAlertTextField.getText().strip();
        String description = descriptionTextField.getText();
        String imageUrl = imageTextField.getText();
       
        // USER VALIDATION - if user leaves empty boxes. except imageURL and description
        if ( name.isEmpty() || category.isEmpty() ||  priceText.isEmpty() || quantityText.isEmpty() || stockAlertText.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Error: All boxes except Description and Image URL must be filled.");
            return;
        }
        
        // remove dollar sign from price
        priceText = priceText.replace("$", "");
        
        // USER VALIDATION - check price if NOT a double, error message
        if ( !MainWindow.isADouble(priceText) ) {
            JOptionPane.showMessageDialog(this, "Error: price must be a valid decimal value.");
            return;
        }
        
        // if price is double change to double data type
        double price = Double.parseDouble(priceText);
        
        
        // USER VALIDATION - check quantity and stock Alert for being an integer
        if ( !MainWindow.isAnInteger(quantityText) || !MainWindow.isAnInteger(stockAlertText) ) {
            JOptionPane.showMessageDialog(this, "Error: Stock Quantity and Stock Alert Level must have valid whole number values.");
            return;
        }
        
        // if quantity and stock alert are whole numbers change to int data type
        int quantity = Integer.parseInt(quantityText);
        int stockAlert = Integer.parseInt(stockAlertText);
        
        // check if price, quantity, and stockAlert are <= 0, if so then display error
        if ( price <= 0 || quantity <= 0 || stockAlert <= 0) {
            JOptionPane.showMessageDialog(this, "Error: Price, Stock Quantity, and Stock Alert Level must be values greater than zero.");
            return;
        }
        
        //SQL command
        String updateSQL = "UPDATE products SET name=?, category=?, price=?, stock_quantity=?, "
                            + "low_stock_threshold=?, description=?, image_url=? WHERE product_id=?"; // <<---- ? used to prevent SQL injections
        
        
         try (Connection conn = DatabaseUtil.getConnection(); //my shared connection
         PreparedStatement stmt = conn.prepareStatement(updateSQL)) { //creates prepared statement obj for assigning

        //sets the values for the prepared statement from the corresponding variable
        stmt.setString(1, name);
        stmt.setString(2, category);
        stmt.setDouble(3, price);
        stmt.setInt(4, quantity);
        stmt.setInt(5, stockAlert);
        stmt.setString(6, description);
        stmt.setString(7, imageUrl);
        stmt.setInt(8, productId);

        // Execute the insert statement
        int rowsAffected = stmt.executeUpdate();

        // Provide feedback based on success
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Product edited successfully! Please refresh.");
            System.out.println("Product added successfully.");
            this.dispose(); //closes the window if sucessful
        } else {
            JOptionPane.showMessageDialog(this, "Failed to edit product.");
            System.out.println("Failed to edit product.");
        }
        } catch (SQLException e) {
            // Handle potential database connection or SQL errors
            e.printStackTrace(); //for debugging
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductsEditButtonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsEditButtonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsEditButtonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsEditButtonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsEditButtonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField imageTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFormBody;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JLabel stockAlertLabel;
    private javax.swing.JTextField stockAlertTextField;
    private javax.swing.JLabel stockQuantityLabel;
    private javax.swing.JTextField stockQuantityTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topMessageLabel;
    // End of variables declaration//GEN-END:variables
}
