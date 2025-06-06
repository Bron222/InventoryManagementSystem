package main.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bron2
 */
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;

public class SalesAddButtonFrame extends javax.swing.JFrame {

    /**
     * Creates new form SalesAddButtonFrame
     */
    
    private ArrayList<Integer> productId = new ArrayList<>(); // vector array to hold productIdTextField
    private ArrayList<Integer> quantity = new ArrayList<>(); // vector arrray to hold quantityTextField
    
    private int productCount = 0; //to track orders
    
    public SalesAddButtonFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        productIdTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        anotherOrderButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        completeOrderButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productCountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add a Sale");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Please fill out all the boxes below to add a sale transaction.");

        jLabel4.setText("Select \"Add another product to sale order\" before submitting if this order contains multiple items.");

        productIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIdTextFieldActionPerformed(evt);
            }
        });

        quantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextFieldActionPerformed(evt);
            }
        });

        anotherOrderButton.setText("Add another product to sale order");
        anotherOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anotherOrderButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        completeOrderButton.setBackground(new java.awt.Color(153, 220, 255));
        completeOrderButton.setText("Complete Sale Order");
        completeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Product ID number:");

        jLabel3.setText("Quantity:");

        jLabel6.setText("Entries added to order:");

        productCountLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productCountLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(anotherOrderButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(completeOrderButton)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelButton)
                            .addComponent(productCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(anotherOrderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completeOrderButton)
                    .addComponent(cancelButton))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(170, 170, 170))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        
        this.dispose(); // closes current window
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void quantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldActionPerformed

    private void anotherOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anotherOrderButtonActionPerformed
        // TODO add your handling code here:
        
        
        // USER VALIDATION - if both fields are empty before adding a product to sale order
        if (productIdTextField.getText().strip().equals("") || quantityTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Error. All criteria must be filled in before adding a product to this sale order.");
            return;
        }
        
        // USER VALIDATION - if one field is blank, create an error message
        if (((!productIdTextField.getText().strip().isEmpty() && quantityTextField.getText().strip().isEmpty()) 
            || (productIdTextField.getText().strip().isEmpty() && !quantityTextField.getText().strip().isEmpty()))) {
            
            JOptionPane.showMessageDialog(this, "Error. Must fill out all criteria before adding a product to this sale order.");
            return;
        }
        
        // USER VALIDATION - check if both user values are integers
        if ( !MainWindow.isAnInteger(productIdTextField.getText().strip()) || !MainWindow.isAnInteger(quantityTextField.getText().strip()) ) {
            JOptionPane.showMessageDialog(this, "Error: Product ID and Quantity must be valid whole number values.");
            return;
        }
        
        //temperary value placement for user validation
        int tempProductId = Integer.parseInt(productIdTextField.getText().strip());
        int tempQuantity = Integer.parseInt(quantityTextField.getText().strip());
        
        // USER VALIDATION - check if values are greater than 0
        if ( tempProductId <= 0 || tempQuantity <= 0 ) {
            JOptionPane.showMessageDialog(this, "Error: Product ID and Quantity must have a value greater than zero.");
            return;
        }
        
        // convert textFields from strings to int to prepare for DB
        productId.add(Integer.parseInt(productIdTextField.getText().strip()));
        quantity.add(Integer.parseInt(quantityTextField.getText().strip()));
         
            // clear the text field for new entries
            productIdTextField.setText("");
            quantityTextField.setText("");
            
            productCount += 1; // adds a count to the total amount of orders added to sale
            productCountLabel.setText(Integer.toString(productCount)); // displays the count
    }//GEN-LAST:event_anotherOrderButtonActionPerformed

    private void completeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderButtonActionPerformed
        // TODO add your handling code here:
        
        // bool variatble to hold status of text boxes and vector
        boolean productIdIsEmpty = productIdTextField.getText().strip().isEmpty(); // true if productId Text field is empty
        boolean quantityIsEmpty = quantityTextField.getText().strip().isEmpty(); // true if quanitity text field is empty
        boolean vectorIsEmpty = productId.isEmpty(); // true if the vector for productId is empty
        
        // USER VALIDATION - if only one text field is filled, create an error alert
        if ( (productIdIsEmpty && !quantityIsEmpty) || (!productIdIsEmpty && quantityIsEmpty) ) {
            
            JOptionPane.showMessageDialog(this, "Error: Must fill out both criteria or add at least one product to this sale order to submit.");
            return;
        }
        
        // USER VALIDATION - if both text fields are empty AND the vector is empty, create error message
        if ( (vectorIsEmpty) && (productIdIsEmpty && quantityIsEmpty) ) {
            JOptionPane.showMessageDialog(this, "Error: Either both criteria must be filled or add at least one product to this sale order to submit.");
            return;
        }

        // USER VALIDATION - if both text fields are filled OR if vector is filled - then proceed to add data to vector (if applicable) then add data to DB
        if ( (!productIdIsEmpty && !quantityIsEmpty) || (!vectorIsEmpty) ) {
            
            // USER VALIDATION - check if both boxes values are filled, if so check if integers
            if ( !productIdIsEmpty && !quantityIsEmpty ) {
                if ( !MainWindow.isAnInteger(productIdTextField.getText().strip()) || !MainWindow.isAnInteger(quantityTextField.getText().strip()) ) {
                    JOptionPane.showMessageDialog(this, "Error: Product ID and Quantity must be valid whole number values.");
                    return;
                }
            } 
            // only add text box input toi vector if they are both filled
            if (!productIdIsEmpty && !quantityIsEmpty) {
                // temporary value placement for user validation
                int tempProductId = Integer.parseInt(productIdTextField.getText().strip());
                int tempQuantity = Integer.parseInt(quantityTextField.getText().strip());
            
                // USER VALIDATION - check if values are greater than 0
                if ( tempProductId <= 0 || tempQuantity <= 0 ) {
                    JOptionPane.showMessageDialog(this, "Error: Product ID and Quantity must have a value greater than zero.");
                    return;
                }
                
                productId.add(tempProductId); // add values to vector
                quantity.add(tempQuantity);
            
                productCount += 1; // adds a count to the total amount of orders added to sale
                productCountLabel.setText(Integer.toString(productCount));
            }
            
            
            
            //------------------> enter DB stuff here <------------------------------
            try (Connection conn = DatabaseUtil.getConnection()) {
                conn.setAutoCommit(false); // begin

                // inserts into Sales table with default 0.00 total
                String insertSaleSQL = "INSERT INTO sales (total_amount) VALUES (?)";
                PreparedStatement saleStmt = conn.prepareStatement(insertSaleSQL, Statement.RETURN_GENERATED_KEYS);
                saleStmt.setDouble(1, 0.00);
                saleStmt.executeUpdate();

                ResultSet generatedKeys = saleStmt.getGeneratedKeys();
                
                int saleId = -1; // to flag error
                
                if (generatedKeys.next()) {
                    saleId = generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Creating sale failed, no ID obtained.");
                }

                // inserts each product/quantity into SalesItems and calculate total
                String insertItemSQL = "INSERT INTO salesitems (sale_id, product_id, quantity) VALUES (?, ?, ?)";
                PreparedStatement itemStmt = conn.prepareStatement(insertItemSQL);

                String priceQuery = "SELECT price FROM products WHERE product_id = ?";
                PreparedStatement priceStmt = conn.prepareStatement(priceQuery);

                double totalAmount = 0.0;

                for (int i = 0; i < productId.size(); i++) {
                    int pid = productId.get(i);
                    int qty = quantity.get(i);

                    // get product price
                    priceStmt.setInt(1, pid);
                    ResultSet rs = priceStmt.executeQuery();
                    if (rs.next()) {
                        double price = rs.getDouble("price");
                        totalAmount += price * qty;
                        
                        // update the product table to reflect the new quantity after the sale
                        String updateStockSQL = "UPDATE products SET stock_quantity = stock_quantity - ? WHERE product_id = ?";
                        PreparedStatement stockStmt = conn.prepareStatement(updateStockSQL);
                        stockStmt.setInt(1, qty);
                        stockStmt.setInt(2, pid);
                        stockStmt.executeUpdate();
                    }

                    // insert the item
                    itemStmt.setInt(1, saleId);
                    itemStmt.setInt(2, pid);
                    itemStmt.setInt(3, qty);
                    itemStmt.addBatch();
                }

                itemStmt.executeBatch();

                // update total_amount in Sales
                String updateTotalSQL = "UPDATE sales SET total_amount = ? WHERE sale_id = ?";
                PreparedStatement updateStmt = conn.prepareStatement(updateTotalSQL);
                updateStmt.setDouble(1, totalAmount);
                updateStmt.setInt(2, saleId);
                updateStmt.executeUpdate();

                conn.commit(); // commits to the DB
                JOptionPane.showMessageDialog(this, "Sale completed successfully! Please refresh.");

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }

            // close the window
            this.dispose();
        }
    }//GEN-LAST:event_completeOrderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SalesAddButtonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesAddButtonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesAddButtonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesAddButtonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesAddButtonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anotherOrderButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton completeOrderButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel productCountLabel;
    private javax.swing.JTextField productIdTextField;
    private javax.swing.JTextField quantityTextField;
    // End of variables declaration//GEN-END:variables
}
