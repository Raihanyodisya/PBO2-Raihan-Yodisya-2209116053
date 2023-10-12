/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokobarangantikfix.layanan;

/**
 *
 * @author NITRO 5
 */

import com.mycompany.tokobarangantikfix.isi.AntiqueItem;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private static final List<AntiqueItem> inventory = new ArrayList<>();

    public static void addItem(AntiqueItem item) {
        inventory.add(item);
    }

    public static void removeItem(AntiqueItem item) {
    inventory.removeIf(existingItem -> existingItem.getName().equals(item.getName()));
}

    public static List<AntiqueItem> getInventory() {
        return inventory;
    }

    public static void updateItem(AntiqueItem existingItem, AntiqueItem updatedItem) {
    // Cari indeks item yang akan diubah
    int index = -1;
    for (int i = 0; i < inventory.size(); i++) {
        if (inventory.get(i).getName().equals(existingItem.getName())) {
            index = i;
            break;
        }
    }
    
    if (index != -1) {
        // Jika item ditemukan, perbarui item dengan yang baru
        inventory.set(index, updatedItem);
    }
    
}

}