/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.salestracking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monster Huma H5 v4.1
 */
public class ShowMyOrder extends javax.swing.JFrame {

    private BuySellOrder buysellorder;
    DefaultTableModel tbl_model;

    /**
     * Creates new form ShowMyOrder
     */
    public ShowMyOrder() {
        initComponents();
        tbl_model = new DefaultTableModel();
        tbl_model.setColumnIdentifiers(new Object[]{"Sales Code", "Buyyer", "Seller", "Products", "Piece", "Price", "Date"});
        tbl_orders.setModel(tbl_model);

        Property.showOrdersTable(tbl_model, User.getName());
    }

    public ShowMyOrder(BuySellOrder bso) {
        initComponents();
        this.buysellorder = bso;
        bso.setVisible(false);

        tbl_model = new DefaultTableModel();
        tbl_model.setColumnIdentifiers(new Object[]{"Sales Code", "Buyyer", "Seller", "Products", "Piece", "Price", "Date"});
        tbl_orders.setModel(tbl_model);

        Property.showOrdersTable(tbl_model, User.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_orders = new javax.swing.JTable();
        txt_seller = new javax.swing.JTextField();
        txt_product = new javax.swing.JTextField();
        txt_piece = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        bttn_showorder_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 255, 253));

        tbl_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_orders);

        txt_seller.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_sellerKeyReleased(evt);
            }
        });

        txt_product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_productKeyReleased(evt);
            }
        });

        txt_piece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pieceKeyReleased(evt);
            }
        });

        txt_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_priceKeyReleased(evt);
            }
        });

        txt_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dateKeyReleased(evt);
            }
        });

        bttn_showorder_back.setText("Back");
        bttn_showorder_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_showorder_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttn_showorder_back, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_seller, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_product, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_piece, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_piece, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bttn_showorder_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_seller)
                    .addComponent(txt_date)
                    .addComponent(txt_product))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_showorder_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_showorder_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buysellorder.setVisible(true);
    }//GEN-LAST:event_bttn_showorder_backActionPerformed

    private void txt_sellerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sellerKeyReleased
        txt_product.setText("");
        txt_piece.setText("");
        txt_price.setText("");
        txt_date.setText("");

        tbl_model.setRowCount(0);
        String stext = txt_seller.getText();

        try {
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.orders WHERE Seller LIKE '%" + stext + "%' AND Buyyer LIKE '" +User.getName()+ "'";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Sales Code");
                String buyyer = rs.getString("Buyyer");
                String seller = rs.getString("Seller");
                String product = rs.getString("Products");
                int pieces = rs.getInt("Pieces");
                double price = rs.getDouble("Price");
                String date = rs.getString("Date");

                tbl_model.addRow(new Object[]{id, buyyer, seller, product, pieces, price, date});
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ShowMyOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_sellerKeyReleased

    private void txt_productKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_productKeyReleased
        txt_seller.setText("");
        txt_piece.setText("");
        txt_price.setText("");
        txt_date.setText("");

        tbl_model.setRowCount(0);
        String stext = txt_product.getText();

        try {
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.orders WHERE Products LIKE '%" + stext + "%' AND Buyyer LIKE '" +User.getName()+ "'";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Sales Code");
                String buyyer = rs.getString("Buyyer");
                String seller = rs.getString("Seller");
                String product = rs.getString("Products");
                int pieces = rs.getInt("Pieces");
                double price = rs.getDouble("Price");
                String date = rs.getString("Date");

                tbl_model.addRow(new Object[]{id, buyyer, seller, product, pieces, price, date});
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ShowMyOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_productKeyReleased

    private void txt_pieceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pieceKeyReleased
        // TODO add your handling code here:
        txt_seller.setText("");
        txt_product.setText("");
        txt_price.setText("");
        txt_date.setText("");

        tbl_model.setRowCount(0);
        String stext = txt_piece.getText();

        try {
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.orders WHERE Pieces LIKE '%" + stext + "%' AND Buyyer LIKE '" +User.getName()+ "'";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Sales Code");
                String buyyer = rs.getString("Buyyer");
                String seller = rs.getString("Seller");
                String product = rs.getString("Products");
                int pieces = rs.getInt("Pieces");
                double price = rs.getDouble("Price");
                String date = rs.getString("Date");

                tbl_model.addRow(new Object[]{id, buyyer, seller, product, pieces, price, date});
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ShowMyOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_pieceKeyReleased

    private void txt_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_priceKeyReleased
        // TODO add your handling code here:
        txt_seller.setText("");
        txt_product.setText("");
        txt_piece.setText("");
        txt_date.setText("");

        tbl_model.setRowCount(0);
        String stext = txt_price.getText();

        try {
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.orders WHERE Price LIKE '%" + stext + "%' AND Buyyer LIKE '" +User.getName()+ "'";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Sales Code");
                String buyyer = rs.getString("Buyyer");
                String seller = rs.getString("Seller");
                String product = rs.getString("Products");
                int pieces = rs.getInt("Pieces");
                double price = rs.getDouble("Price");
                String date = rs.getString("Date");

                tbl_model.addRow(new Object[]{id, buyyer, seller, product, pieces, price, date});
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ShowMyOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_priceKeyReleased

    private void txt_dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dateKeyReleased
        // TODO add your handling code here:
        txt_seller.setText("");
        txt_product.setText("");
        txt_piece.setText("");
        txt_price.setText("");

        tbl_model.setRowCount(0);
        String stext = txt_date.getText();

        try {
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.orders WHERE Date LIKE '%" + stext + "%' AND Buyyer LIKE '" +User.getName()+ "'";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Sales Code");
                String buyyer = rs.getString("Buyyer");
                String seller = rs.getString("Seller");
                String product = rs.getString("Products");
                int pieces = rs.getInt("Pieces");
                double price = rs.getDouble("Price");
                String date = rs.getString("Date");

                tbl_model.addRow(new Object[]{id, buyyer, seller, product, pieces, price, date});
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ShowMyOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_dateKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_showorder_back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_orders;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_piece;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_product;
    private javax.swing.JTextField txt_seller;
    // End of variables declaration//GEN-END:variables
}
