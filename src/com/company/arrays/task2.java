package com.company.arrays;

public class task2 {
    public int[] reverse(int tab[]){
        int a=tab[0];
        tab[0]=tab[2];
        tab[2]=a;
        return tab;
    }
}
