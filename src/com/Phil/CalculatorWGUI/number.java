package com.Phil.CalculatorWGUI;

public class number {

    private double a = 0;

    public number() {
    }

    public void addDigit(double b){
    a = ((a*10)+b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

}
