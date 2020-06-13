package com.somyaranjan;

class LargestPrime {
     static int getLargestPrime(int number) {
        if(number > 1) {
            int value = 0;
            for(int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    value = i;
                    number /= i;
                }
            }
            return value;
        }
        return -1;
    }
}
