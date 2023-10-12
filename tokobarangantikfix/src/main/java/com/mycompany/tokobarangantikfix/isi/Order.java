/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobarangantikfix.isi;

/**
 *
 * @author NITRO 5
 */

import com.mycompany.tokobarangantikfix.tampilan.Orderable;
import com.mycompany.tokobarangantikfix.tampilan.Sellable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Orderable {
    private final Customer customer;
    private final List<Sellable> items;
    private double totalAmount;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

//    public Order(Customer customer) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @Override
    public void addItem(Sellable item) {
        items.add(item);
        totalAmount += item.getPrice();
    }

    @Override
    public void removeItem(Sellable item) {
        items.remove(item);
        totalAmount -= item.getPrice();
    }

    @Override
    public double calculateTotal() {
        return totalAmount;
    }
}