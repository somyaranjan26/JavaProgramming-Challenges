package com.somyaranjan;

public class DigitCount {

    public static int getDigitCount (int num) {
        if (num < 0)
            return -1;
        else {
            int count = 1;
            num /= 10;
            while (num > 0) {
                num /= 10;
                count++;
            }
            return count;
        }
    }
}
