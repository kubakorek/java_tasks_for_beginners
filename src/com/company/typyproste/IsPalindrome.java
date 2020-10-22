package com.company.typyproste;

public class IsPalindrome{
    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i)==word.charAt(word.length()-1-i)) return true; break;
        }
        return false;
    }
}
