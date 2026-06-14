package com.springcore.reference;

public class referenceA {
    private int x;
    private referenceB ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public referenceB getOb() {
        return ob;
    }

    public void setOb(referenceB ob) {
        this.ob = ob;
    }

    public referenceA() {
        super();
    }

    @Override
    public String toString() {
        return "referenceA{" +"x= " + x + " , ob= " + ob +'}';
    }
}
