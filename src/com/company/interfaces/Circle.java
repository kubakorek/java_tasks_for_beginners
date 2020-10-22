package com.company.interfaces;

public class Circle implements Figure {

    private double r;
    public Circle(double r){
        this.r=r;
    }
    public double getArea(){
        return Math.PI*r*r;
    }
    public double getPerimeter(){
        return Math.PI*2*r;
    }
    public String getType() {
        return "circle";
    }


}
