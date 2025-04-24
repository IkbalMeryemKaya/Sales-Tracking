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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monster Huma H5 v4.1
 */
public class Buy extends javax.swing.JFrame {

    static DefaultTableModel tbl_properties_model;
    DefaultTableModel shopping_model;
    private BuySellOrder buysellorder;

    /**
     * Creates new form Buy
     */
    public Buy() {
        initComponents();
        shopping_model = new DefaultTableModel();
        shopping_model.setColumnIdentifiers(new Object[]{"NAME", "PIECE"});
        tbl_shopping.setModel(shopping_model);
        tbl_properties_model = new DefaultTableModel();
        tbl_properties_model.setColumnIdentifiers(new Object[]{"NAME", "PRICE", "PIECE"});
        tbl_buy_properties.setModel(tbl_properties_model);

        Property.showPropertiesTableNotMine(tbl_properties_model, User.getName());
    }

    public Buy(BuySellOrder bso) {
        initComponents();
        this.buysellorder = bso;
        bso.setVisible(false);

        shopping_model = new DefaultTableModel();
        shopping_model.setColumnIdentifiers(new Object[]{"NAME", "PIECE"});
        tbl_shopping.setModel(shopping_model);
        tbl_properties_model = new DefaultTableModel();
        tbl_properties_model.setColumnIdentifiers(new Object[]{"NAME", "PRICE", "PIECE"});
        tbl_buy_properties.setModel(tbl_properties_model);

        Property.showPropertiesTableNotMine(tbl_properties_model, User.getName());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_buy_properties = new javax.swing.JTable();
        Spinner = new javax.swing.JSpinner();
        bttn_add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_shopping = new javax.swing.JTable();
        bttn_remove = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_totalprice = new javax.swing.JLabel();
        bttn_completeshopping = new javax.swing.JButton();
        bttn_buy_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(681, 550));

        jPanel2.setBackground(new java.awt.Color(190, 255, 253));

        tbl_buy_properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_buy_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_buy_propertiesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_buy_properties);

        Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        bttn_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bttn_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Monster Huma H5 v4.1\\Downloads\\pngwing.com (5) (1).png")); // NOI18N
        bttn_add.setText("         Add To Cart");
        bttn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bttn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buy", jPanel2);

        jPanel1.setBackground(new java.awt.Color(190, 255, 253));

        tbl_shopping.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_shopping);

        bttn_remove.setText("Remove From Cart");
        bttn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_removeActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        lbl_totalprice.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        lbl_totalprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_totalprice)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bttn_completeshopping.setText("Complete Shopping");
        bttn_completeshopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_completeshoppingActionPerformed(evt);
            }
        });

        bttn_buy_back.setText("Back");
        bttn_buy_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_buy_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttn_remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttn_completeshopping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttn_buy_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(bttn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(bttn_completeshopping, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttn_buy_back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cart", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_addActionPerformed
        // TODO add your handling code here:
        selectedRow = tbl_buy_properties.getSelectedRow();

        String name = (String) tbl_properties_model.getValueAt(selectedRow, 0);
        double price = (double) tbl_properties_model.getValueAt(selectedRow, 1);
        int stock = (int) tbl_properties_model.getValueAt(selectedRow, 2);
        int howmany = (int) Spinner.getValue();
        
        shopping_model.addRow(new Object[]{name, howmany});
        totalprice += howmany * price;
        lbl_totalprice.setText(totalprice + " TL");

        tbl_buy_properties.setValueAt((stock-howmany), selectedRow, 2);
    }//GEN-LAST:event_bttn_addActionPerformed
    int selectedRow;
    private void tbl_buy_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_buy_propertiesMouseClicked
        // TODO add your handling code here:
        selectedRow = tbl_buy_properties.getSelectedRow();
        int selectedStock = (int) tbl_properties_model.getValueAt(selectedRow, 2);
        Property.setMaxValue(Spinner, selectedStock);
    }//GEN-LAST:event_tbl_buy_propertiesMouseClicked
    double totalprice = 0;
    private void bttn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_removeActionPerformed
        // TODO add your handling code here:
        selectedRow = tbl_shopping.getSelectedRow();
        String name = (String) shopping_model.getValueAt(selectedRow, 0);
        int piece = (int) shopping_model.getValueAt(selectedRow, 1);
        double price = 0;

        try {
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.properties WHERE Name LIKE '%" + name + "%'";

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            price = rs.getDouble("Price");

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
        }

        shopping_model.removeRow(selectedRow);
        totalprice -= piece * price;
        lbl_totalprice.setText(totalprice + " TL");
        
    }//GEN-LAST:event_bttn_removeActionPerformed

    private void bttn_completeshoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_completeshoppingActionPerformed
        // TODO add your handling code here:
        for (int a = 0; a < tbl_shopping.getRowCount(); a++) {
            String seller = null;
            String product = (String) tbl_shopping.getValueAt(a, 0);
            int piece = (int) tbl_shopping.getValueAt(a, 1);
            double netprice = 0;
            int oldPiece = 0;

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy / HH:mm");
            String date = now.format(formatter);

            try {
                String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
                Connection conn = DriverManager.getConnection(cstr);
                Statement stmt = conn.createStatement();
                String query = "SELECT * FROM saleınfos.properties WHERE Name LIKE '%" + product + "%'";

                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    oldPiece = rs.getInt("Pieces");
                    seller = rs.getString("Whoisadd");
                    netprice = rs.getDouble("Price");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
            }

            double price = piece * netprice;

            try {
                String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
                Connection conn = DriverManager.getConnection(cstr);
                Statement stmt = (Statement) conn.createStatement();
                String query = "INSERT INTO orders"
                        + "(Buyyer, Seller, Products, Pieces, Price, Date)"
                        + "VALUES("
                        + "'" + User.getName() + "',"
                        + "'" + seller + "',"
                        + "'" + product + "',"
                        + "'" + piece + "',"
                        + "'" + price + "',"
                        + "'" + date + "')";

                stmt.executeUpdate(query);
                conn.close();

            } catch (Exception ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
                Connection conn = DriverManager.getConnection(cstr);
                Statement stmt = (Statement) conn.createStatement();
                String query = "UPDATE properties SET Pieces=" + (oldPiece-piece) + " WHERE Name='" + product + "'";

                stmt.executeUpdate(query);
                conn.close();
            } catch (Exception ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        shopping_model.setRowCount(0);
        lbl_totalprice.setText("");

        JOptionPane.showMessageDialog(null, "Thank you for choosing us.");
    }//GEN-LAST:event_bttn_completeshoppingActionPerformed

    private void bttn_buy_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_buy_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buysellorder.setVisible(true);
    }//GEN-LAST:event_bttn_buy_backActionPerformed


    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Spinner;
    private javax.swing.JButton bttn_add;
    private javax.swing.JButton bttn_buy_back;
    private javax.swing.JButton bttn_completeshopping;
    private javax.swing.JButton bttn_remove;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_totalprice;
    private javax.swing.JTable tbl_buy_properties;
    private javax.swing.JTable tbl_shopping;
    // End of variables declaration//GEN-END:variables
}
