package com.apress.projs.store;

public class Product {

    private int id;
    private String name;
    private String price;

    public Product(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", id=" + id + '}';
    }

}
