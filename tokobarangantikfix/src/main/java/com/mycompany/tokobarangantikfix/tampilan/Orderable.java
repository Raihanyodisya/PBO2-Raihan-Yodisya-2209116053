/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobarangantikfix.tampilan;

/**
 *
 * @author NITRO 5
 */
public interface Orderable {
    void addItem(Sellable item);
    void removeItem(Sellable item);
    double calculateTotal();
}