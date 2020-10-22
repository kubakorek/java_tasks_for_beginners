package com.company.typyproste;

import java.util.Scanner;
public class Task4 {
    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i)==word.charAt(word.length()-1-i)) return true; break;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(st.length());
        System.out.println(isPalindrome(st));

    }

}
