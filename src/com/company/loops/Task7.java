package com.company.loops;

public class Task7 {
    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i)==word.charAt(word.length()-1-i)) return true; break;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("kajak"));
    }
}
