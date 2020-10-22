package com.company.loops;

public class Task8 {
    public static void print_array(int arr[]){
        System.out.print("[");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(",");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int tab[]={1,2,3,4,5,6,7,8};
        print_array(tab);
    }
}
