package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Fore refer https://www.youtube.com/watch?v=IxW0B7M3Ndg&list=PL0zysOflRCekeiERASkpi-crREVensZGS&index=27

@Component
public class SpelDemo {
    @Value("#{22+11}")
    private int x;
    @Value("#{22+11+33+44}")
    private int y;
    @Value("#{ T(java.lang.Math).sqrt(25) }")
    private double z;

    @Value("#{ T(java.lang.Math).PI}")
    private int e;

    @Value("#{ new java.lang.String('Santosh Kumar')}")
    private String name;

    //@Value("#{ 8>5 }")
    @Value("#{ 8-2 > 5 }")
    private boolean isActive;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "SpelDemo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
