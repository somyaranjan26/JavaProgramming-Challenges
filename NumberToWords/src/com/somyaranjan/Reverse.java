package com.somyaranjan;

public class Reverse {
    public static int reverse (int num) {
        int rev = 0;
        while (num != 0) {
            rev *=10;
            rev = rev + (num % 10);
            num /= 10;
        }
        return rev;
    }

}
