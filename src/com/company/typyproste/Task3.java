package com.company.typyproste;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tab[]=new int[n];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Wprowadź " + (i + 1) + " liczbę do tablicy.");
            tab[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(tab[n]);

        }
    }
}
