package com.springcore.lifecycle;

public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Product() {
        super();
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside Init Method");
    }
    public void destroy(){
        System.out.println("Inside Destroy Method");
    }
}
