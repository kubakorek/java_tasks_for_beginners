package com.company.objects;

public class Rectangle {
    private double a;
    private double b;
    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }
    public double getperimeter(){
        return 2*a+2*b;
    }
    public double getarea(){
        return a*b;
    }
    public double getdiagonal(){
        return Math.sqrt(a*a+b*b);
    }

    public static void main(String[] args) {
        double a=3;
        double b=4;


    }

}
