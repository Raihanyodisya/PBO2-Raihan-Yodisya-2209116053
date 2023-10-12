# PBO2-Raihan-Yodisya-2209116053
Toko Barang Antik
Aplikasi "Toko Barang Antik" adalah sebuah program sederhana yang memungkinkan pengguna untuk mengelola barang antik, baik sebagai admin yang dapat menambah, mengubah, dan menghapus barang, maupun sebagai pelanggan yang dapat melihat daftar barang dan membeli barang yang diinginkan.

Fitur Aplikasi
Aplikasi ini memiliki beberapa fitur utama:

Admin:
Login Admin: Admin dapat login menggunakan username dan password yang telah ditentukan.
Tambah Barang Antik: Admin dapat menambahkan barang antik ke dalam daftar inventaris.
Tampilkan Semua Barang Antik: Admin dapat melihat daftar semua barang antik yang ada di inventaris.
Ubah Barang Antik: Admin dapat mengubah informasi barang antik yang sudah ada di inventaris.
Hapus Barang Antik: Admin dapat menghapus barang antik dari inventaris.
Keluar: Admin dapat keluar dari sesi admin.
Customer:
Login Customer: Pelanggan dapat login menggunakan username dan password yang telah ditentukan.
Tampilkan Semua Barang Antik: Pelanggan dapat melihat daftar semua barang antik yang ada di inventaris.
Beli Barang Antik: Pelanggan dapat memilih barang antik untuk dibeli. Namun, fungsionalitas ini belum diimplementasikan sepenuhnya dalam contoh kode yang diberikan.
Method yang Digunakan
adminLogin(): Metode ini digunakan untuk otentikasi login admin.
customerLogin(): Metode ini digunakan untuk otentikasi login pelanggan.
addItem(AntiqueItem item): Metode ini digunakan untuk menambahkan barang antik ke inventaris.
removeItem(AntiqueItem item): Metode ini digunakan untuk menghapus barang antik dari inventaris.
getInventory(): Metode ini digunakan untuk mendapatkan daftar semua barang antik yang ada di inventaris.
updateItem(AntiqueItem existingItem, AntiqueItem updatedItem): Metode ini digunakan untuk memperbarui informasi barang antik yang sudah ada dalam inventaris.
createOrder(Customer customer): Metode ini digunakan untuk membuat pesanan oleh pelanggan.
processOrder(Order order): Metode ini digunakan untuk memproses pesanan. Namun, fungsionalitas ini belum diimplementasikan sepenuhnya dalam contoh kode yang diberikan.
Access Modifier yang Digunakan
Dalam kode ini, kita menggunakan berbagai access modifier:

public: Dapat diakses dari luar kelas.
private: Hanya dapat diakses dari dalam kelas yang sama.
Tidak ada access modifier: Default, yang berarti dapat diakses oleh kelas dalam paket yang sama.
Collection yang Digunakan
List<AntiqueItem>: Untuk menyimpan barang antik dalam inventaris.
Best Practices
Beberapa best practices yang diikuti dalam kode ini:

Penggunaan access modifiers yang tepat untuk mengatur visibilitas variabel dan metode.
Penggunaan antarmuka (Orderable dan Sellable) untuk menggabungkan kontrak yang diperlukan yang harus diimplementasikan oleh kelas terkait.
Metode addItem dan removeItem dalam kelas Order digunakan untuk menambahkan dan menghapus item dari pesanan pelanggan. Ini adalah contoh penggunaan metode untuk memisahkan logika bisnis dari variabel publik.
