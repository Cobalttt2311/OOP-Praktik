package com.polban.jtk.sales;

public class Product {
    private String productName;
    private int price;
    private int stock;

    // Constructor
    public Product(String productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
            System.out.println("Harga baru untuk " + productName + ": " + this.price);
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println(amount + " unit ditambahkan ke stok"); 
            System.err.println("Stok sekarang: " + this.stock);
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }

    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + productName + " terjual.");
        } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }
}
