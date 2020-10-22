package com.company.loops;

public class Task5 {
    public static void reverse_word(String word){
        for (int i = word.length()-1; i >=0; i--) {
            System.out.println(word.charAt(i));

        }
    }

    public static void main(String[] args) {
        reverse_word("cojest");
    }
}
