package com.company.loops;

public class Task10 {
    public static int[] sort(int tab[]) {
        for (int j = 0; j < tab.length*tab.length; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int a = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = a;
                } else break;
            }
        }
            return tab;
        }

    public static void main(String[] args) {
        int tab[]={4,3,2,6,1,9,5};
        sort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }


    }
}
