/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salestracking;

import java.util.ArrayList;

/**
 *
 * @author Monster Huma H5 v4.1
 */
public class Order {
            
    String buyyer;
    String seller;
    ArrayList<Property> product;
    int piece;
    double price;
    
    public Order(String buyyer, String seller, ArrayList<Property> product, int piece, double price){
        this.buyyer = buyyer;
        this.seller = seller;
        this.product = product;
        this.piece = piece;
        this.price = price;
    }
}
