package com.company.loops;

public class Task4 {
    public static void revnumb(int number){
    String s=String.valueOf(number);
        for (int i = s.length()-1; i >=0; i--) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        revnumb(123);
    }
}
