package com.company.objects;

public class Mynumber {
    private int number;
    Mynumber(int number){
        this.number=number;
    }
    public boolean isOdd(){
        if (number%2==0)return false;
        else return true;
    }
    public boolean isEven(){
        if (number%2==0)return true;
        else return false;
    }
    public double sqrt(){
        return Math.sqrt(number);
    }
    public double pow(int x){
        return Math.pow(number,x);
    }
    public int add(int x){
        return number+x;
    }
    public int subtract(int x){
        return number-x;
    }


}
