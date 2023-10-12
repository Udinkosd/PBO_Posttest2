package Crud;
import Database.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void run(boolean isAdmin) {
        final List<Product> products = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Perbarui Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Produk: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan Harga Produk: ");
                    double price = Double.parseDouble(input.nextLine());
                    System.out.print("Masukkan Stok Produk: ");
                    int stock = Integer.parseInt(input.nextLine());

                    Product newProduct = new Product(products.size() + 1, name, price, stock);
                    products.add(newProduct);
                    System.out.println("Produk berhasil ditambahkan!");
                    break;
                case 2:
                    for (Product product : products) {
                        System.out.println("ID: " + product.getId());
                        System.out.println("Nama: " + product.getName());
                        System.out.println("Harga: Rp" + product.getPrice());
                        System.out.println("Stok: " + product.getStock());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan ID Produk yang akan diperbarui: ");
                    int updateId = input.nextInt();
                    input.nextLine();
                    Product updateProduct = null;
                    for (Product product : products) {
                        if (product.getId() == updateId) {
                            updateProduct = product;
                            break;
                        }
                    }

                    if (updateProduct != null) {
                        System.out.print("Masukkan Nama Baru: ");
                        String newName = input.nextLine();
                        System.out.print("Masukkan Harga Baru: ");
                        double newPrice = Double.parseDouble(input.nextLine());
                        System.out.print("Masukkan Stok Baru: ");
                        int newStock = Integer.parseInt(input.nextLine());

                        updateProduct.setName(newName);
                        updateProduct.setPrice(newPrice);
                        updateProduct.setStock(newStock);
                        System.out.println("Produk berhasil diperbarui!");
                    } else {
                        System.out.println("Produk dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan ID Produk yang akan dihapus: ");
                    int deleteId = input.nextInt();
                    input.nextLine();
                    Product deleteProduct = null;
                    for (Product product : products) {
                        if (product.getId() == deleteId) {
                            deleteProduct = product;
                            break;
                        }
                    }

                    if (deleteProduct != null) {
                        products.remove(deleteProduct);
                        System.out.println("Produk berhasil dihapus!");
                    } else {
                        System.out.println("Produk dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari Aplikasi.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }
}
