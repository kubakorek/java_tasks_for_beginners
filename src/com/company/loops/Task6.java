package com.company.loops;

public class Task6 {
    public static void binary(int a){
        String binaryreversed="";
        while(a>0){
            binaryreversed+= a%2;
            a/=2;
        }
        System.out.println(binaryreversed);
    }
}
