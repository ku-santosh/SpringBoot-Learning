package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated Method stub
        // Init Method
        System.out.println("having Pepsi : Init");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated Method stub
        // Destroy Method
        System.out.println("Going to put bottle back to shop : Destroy");
    }
}
