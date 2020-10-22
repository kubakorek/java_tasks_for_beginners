package com.company.loops;

public class Task2 {
    public static void from_zero_to_x(int x){
        int i=1;
        while(i<=x){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        from_zero_to_x(7);
    }
}
