package com.andreakim.tvstore;

/**
 * Created by andreakim on 6/22/16.
 */
public class Tvs {
    public int id;
    public String brand;
    public String size;
    public int price;


    public Tvs(int id, String name, String brand, int price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
