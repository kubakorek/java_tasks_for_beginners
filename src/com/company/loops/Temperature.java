package com.company.loops;

import java.util.Scanner;

public class Temperature {
    public static void temp(){
        System.out.println("Insert temperature:");
        Scanner sc= new Scanner(System.in);
        double n=sc.nextDouble();
        if (n>0) System.out.println("Temperatura jest dodatnia.");
        else System.out.println("Temperatura jest ujemna.");
    }

    public static void main(String[] args) {
        temp();

    }
}
