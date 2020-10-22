package com.company.objects;

public class Human {
private int Age;
private double weight;
private double height;
private String name;
private boolean isMale;
public Human(int Age, double weight,double height,String name,boolean isMale){
    this.Age=Age;
    this.weight=weight;
    this.height=height;
    this.name=name;
    this.isMale=isMale;
}
public boolean isMale(){
    return isMale;
}
public String getName(){
    return name;
}
public double getWeight(){
    return weight;
}
    public double getHeight() {
        return height;
    }
    public int getAge() {
        return Age;
    }
}
