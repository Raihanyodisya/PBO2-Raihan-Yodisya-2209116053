/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobarangantikfix.layanan;

/**
 *
 * @author NITRO 5
 */
import com.mycompany.tokobarangantikfix.isi.Customer;
import com.mycompany.tokobarangantikfix.isi.Order;

public class OrderService {
    public static Order createOrder(Customer customer) {
        return new Order(customer);
    }

    public static void processOrder(Order order) {
        // Implement order processing logic here
    }
}