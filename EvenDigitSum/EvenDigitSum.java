package com.somyaranjan;

class EvenDigitSum {
    static int getEvenDigitSum(int number) {
//        if (number < 0) {
//            return  -1;
//        }
        int EvenSum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                EvenSum += digit;
            }
            number /= 10;
        }

        return EvenSum;
    }
}
