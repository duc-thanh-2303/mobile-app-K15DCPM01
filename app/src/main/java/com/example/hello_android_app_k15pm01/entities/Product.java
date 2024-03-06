package com.example.hello_android_app_k15pm01.entities;

import androidx.annotation.NonNull;

public class Product {

    private String name;
    private double price;

    private String image;

    public Product(double price, String name, String image) {
        this.name = name;
        this.price = price;

        this.image = image;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }



    public String getImage() {
        return image;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }



    public void setImage(String image) {
        this.image = image;
    }


    @NonNull
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
