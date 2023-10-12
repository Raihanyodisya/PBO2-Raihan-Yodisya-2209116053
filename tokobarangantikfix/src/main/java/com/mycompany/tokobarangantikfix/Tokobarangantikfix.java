/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tokobarangantikfix;
import java.util.Scanner;
import com.mycompany.tokobarangantikfix.isi.AntiqueItem;
import com.mycompany.tokobarangantikfix.layanan.InventoryService;
import com.mycompany.tokobarangantikfix.isi.Customer;

public class Tokobarangantikfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        boolean isAdmin = false; // Menandakan apakah pengguna adalah admin
        Customer currentUser = null; // Informasi pengguna saat ini

        // Pengguna admin (contoh, Anda dapat mengganti ini)
        Customer adminUser = new Customer("admin", "admin@example.com");

        while (isRunning) {
            System.out.println("Toko Barang Antik");
            if (currentUser == null) {
                System.out.println("1. Login Admin");
                System.out.println("2. Login Customer");
                System.out.println("3. Keluar");
            } else {
                if (isAdmin) {
                    System.out.println("1. Tambah Barang Antik");
                    System.out.println("2. Tampilkan Semua Barang Antik");
                    System.out.println("3. Ubah Barang Antik");
                    System.out.println("4. Hapus Barang Antik");
                    System.out.println("5. Keluar");
                } else {
                    System.out.println("1. Tampilkan Semua Barang Antik");
                    System.out.println("2. Beli Barang Antik");
                    System.out.println("3. Keluar");
                }
            }
            System.out.print("Pilih operasi: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Membuang karakter newline

            if (currentUser == null) {
                switch (choice) {
                    case 1:
                        if (adminLogin()) {
                            isAdmin = true;
                            currentUser = adminUser;
                            System.out.println("Login Admin berhasil.");
                        } else {
                            System.out.println("Login Admin gagal.");
                        }
                        break;
                    case 2:
                        currentUser = customerLogin();
                        if (currentUser != null) {
                            System.out.println("Login Customer berhasil.");
                        } else {
                            System.out.println("Login Customer gagal.");
                        }
                        break;
                    case 3:
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Pilih 1, 2, atau 3.");
                }
            } else {
                if (isAdmin) {
                    switch (choice) {
                        case 1 -> {
                            System.out.print("Nama Barang: ");
                            String name = scanner.nextLine();
                            System.out.print("Harga: ");
                            double price = scanner.nextDouble();
                            System.out.print("Tahun: ");
                            int year = scanner.nextInt();

                            AntiqueItem newItem = new AntiqueItem(name, price, year);
                            InventoryService.addItem(newItem);
                            System.out.println("Barang Antik telah ditambahkan.");
                        }
                        case 2 -> {
                            System.out.println("Daftar Barang Antik:");
                            for (AntiqueItem item : InventoryService.getInventory()) {
                                System.out.println("Nama: " + item.getName() + ", Harga: " + item.getPrice() + ", Tahun: " + item.getYear());
                            }
                        }
                        case 3 -> {
                            System.out.print("Nama Barang Antik yang ingin diubah: ");
                            String oldName = scanner.nextLine();
                            System.out.print("Nama Barang: ");
                            String name = scanner.nextLine();
                            System.out.print("Harga: ");
                            double price = scanner.nextDouble();
                            System.out.print("Tahun: ");
                            int year = scanner.nextInt();
                            AntiqueItem updatedItem = new AntiqueItem(name, price, year);
                            AntiqueItem existingItem = new AntiqueItem(oldName, 0.0, 0); // Cari barang berdasarkan nama
                            InventoryService.updateItem(existingItem, updatedItem);
                            System.out.println("Barang Antik telah diubah.");
                        }
                        case 4 -> {
                            System.out.print("Nama Barang Antik yang ingin dihapus: ");
                            String itemName = scanner.nextLine();
                            AntiqueItem itemToDelete = new AntiqueItem(itemName, 0.0, 0); // Cari barang berdasarkan nama
                            InventoryService.removeItem(itemToDelete);
                            System.out.println("Barang Antik telah dihapus.");
                        }
                        case 5 -> {
                            isAdmin = false;
                            currentUser = null; // Keluar dari akun admin atau customer
                        }
                        default -> System.out.println("Operasi tidak valid. Pilih 1, 2, 3, 4, atau 5.");
                    }
                } else {
                    switch (choice) {
                        case 1 -> {
    System.out.println("Daftar Barang Antik:");
    for (AntiqueItem item : InventoryService.getInventory()) {
        System.out.println("Nama: " + item.getName() + ", Harga: " + item.getPrice() + ", Tahun: " + item.getYear());
    }
}
case 2 -> {
    if (currentUser != null) {
        System.out.println("Daftar Barang Antik:");
        for (AntiqueItem item : InventoryService.getInventory()) {
            System.out.println("Nama: " + item.getName() + ", Harga: " + item.getPrice() + ", Tahun: " + item.getYear());
        }
        System.out.print("Pilih barang yang ingin Anda beli (Nama Barang): ");
        String itemNameToBuy = scanner.nextLine();

        AntiqueItem selectedItem = null;
        for (AntiqueItem item : InventoryService.getInventory()) {
            if (item.getName().equalsIgnoreCase(itemNameToBuy)) {
                selectedItem = item;
                break;
            }
        }

        if (selectedItem != null) {
            // Implementasi logika pembelian di sini
            // Anda dapat menambahkan item ke dalam order atau melakukan yang sesuai dengan aplikasi Anda
            System.out.println("Anda telah membeli: " + selectedItem.getName());
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    } else {
        System.out.println("Anda tidak diizinkan untuk melakukan pembelian.");
    }
}

                        case 3 -> currentUser = null; // Keluar dari akun admin atau customer
                        default -> System.out.println("Operasi tidak valid. Pilih 1, 2, atau 3.");
                    }
                }
            }
        }

        System.out.println("Terima kasih!");
    }

    // Metode untuk login admin
    private static boolean adminLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username Admin: ");
        String username = scanner.nextLine();
        System.out.print("Password Admin: ");
        String password = scanner.nextLine();

        // Ganti ini dengan logika autentikasi sesuai dengan kebutuhan Anda
        return username.equals("adminantik") && password.equals("adminantik23");
    }

    // Metode untuk login customer
    private static Customer customerLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username Customer: ");
        String username = scanner.nextLine();
        System.out.print("Password Customer: ");
        String password = scanner.nextLine();

        // Ganti ini dengan logika autentikasi sesuai dengan kebutuhan Anda
        if (username.equals("cst123") && password.equals("cst123")) {
            return new Customer(username, "customer@example.com");
        } else {
            return null; // Login gagal
        }
    }
}