package com.company.interfaces;

public class Rectangle implements Figure {
    private double side_a;
    private double side_b;
    public Rectangle(double side_a,double side_b){
        this.side_a=side_a;
        this.side_b=side_b;
    }

    public double getPerimeter(){
        return 2*(side_b+side_a);
    }

    public double getArea() {
        return side_a*side_b;
    }
    public String getType() {
        return "rectangle";
    }
}
