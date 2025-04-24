/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salestracking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monster Huma H5 v4.1
 */
public class Property {

    String name;
    int pieces = 0;
    double price = 0;

    public Property(String name, int pieces, double price) throws Exception {
        if (name.isEmpty()) {
            throw new EmptyAreaException();
        }
        this.name = name;
        this.pieces = pieces;
        this.price = price;
    }

    public Property(String name, int pieces) throws Exception{
        if (name.isEmpty()) {
            throw new EmptyAreaException();
        }
        this.name = name;
        this.pieces = pieces;
    }
    
    static void setMaxValue(JSpinner spin, int value) {
        SpinnerNumberModel spinner_model = new SpinnerNumberModel(1, 1, value, 1);
        spin.setModel(spinner_model);
    }
    
    static void showPropertiesTableMine(DefaultTableModel table, String username) {
        try {
            table.setRowCount(0);
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.properties WHERE Whoisadd='" + username + "'";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("Name");
                double price = rs.getDouble("Price");
                int pieces = rs.getInt("Pieces");

                table.addRow(new Object[]{name, price, pieces});
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void showPropertiesTableNotMine(DefaultTableModel table, String username) {
        try {
            table.setRowCount(0);
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.properties WHERE Whoisadd<>'" + username + "'";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("Name");
                double price = rs.getDouble("Price");
                int pieces = rs.getInt("Pieces");

                table.addRow(new Object[]{name, price, pieces});
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void showOrdersTable(DefaultTableModel table, String username) {
        try {
            table.setRowCount(0);
            String cstr = "jdbc:mysql://127.0.0.1:3306/saleınfos?user=root&password=ikbal123";
            Connection conn = DriverManager.getConnection(cstr);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM saleınfos.orders WHERE Buyyer='" + username + "'";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("Sales Code");
                String buyyer = rs.getString("Buyyer");
                String seller = rs.getString("Seller");
                String product = rs.getString("Products");
                int pieces = rs.getInt("Pieces");
                double price = rs.getDouble("Price");
                String date = rs.getString("Date");

                table.addRow(new Object[]{id, buyyer, seller, product, pieces, price, date});
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
