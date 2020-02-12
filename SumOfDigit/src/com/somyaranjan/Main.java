package com.somyaranjan;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Sum of digits of 125 : " + sumDigit(7));
    }

    public static int sumDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = 0;

        while(number > 0) {
            // extract the least significant digit or last digit
            int digit = number % 10;
            sum += digit;

            // removing least significant digit or last digit
            number /= 10;
        }

        return  sum;
    }
}
