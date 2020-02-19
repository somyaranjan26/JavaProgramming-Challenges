package com.somyaranjan;

public class NumberPalindrome {

    public boolean isPalindrome(int number) {

        int reverse = 0;
        int originalNumber = number;

        while(number != 0) {
            var digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
