package com.somyaranjan;

public class Main {

    public static void main(String[] args) {
	    NumberPalindrome object = new NumberPalindrome();

	    boolean checker = object.isPalindrome(12321);

	    if(checker) {
	        System.out.println("Number Is Palindrome");
        } else {
	        System.out.println("Number Is Not Palindrome");
        }

    }
}
