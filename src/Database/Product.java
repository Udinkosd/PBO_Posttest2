package Database;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final int id;
    private String name;
    private double price;
    private int stock;

    private static final List<Product> products = new ArrayList<>();

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static void createProduct(String name, double price, int stock) {
        int newId = generateUniqueId();
        Product newProduct = new Product(newId, name, price, stock);
        products.add(newProduct);
        System.out.println("Produk baru telah ditambahkan: " + newProduct.getName());
    }

    public static void readProduct(int productId) {
        Product product = findProductById(productId);
        if (product != null) {
            System.out.println("Informasi Produk:");
            System.out.println("ID: " + product.getId());
            System.out.println("Nama: " + product.getName());
            System.out.println("Harga: Rp" + product.getPrice());
            System.out.println("Stok: " + product.getStock());
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    public static void updateProduct(int productId, String name, double price, int stock) {
        Product product = findProductById(productId);
        if (product != null) {
            product.setName(name);
            product.setPrice(price);
            product.setStock(stock);
            System.out.println("Informasi produk berhasil diperbarui.");
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    public static void deleteProduct(int productId) {
        Product product = findProductById(productId);
        if (product != null) {
            products.remove(product);
            System.out.println("Produk berhasil dihapus.");
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    private static Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }


    private static int generateUniqueId() {
        return (int) (Math.random() * 1000) + 1;
    }
}
