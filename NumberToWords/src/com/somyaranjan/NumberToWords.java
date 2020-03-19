package com.somyaranjan;

public class NumberToWords {

    public static void numberToWords (int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int rev = Reverse.reverse(num);
            int count = DigitCount.getDigitCount(num);

            while (count > 0) {
                int digit = rev % 10;
                rev /= 10;
                switch (digit) {
                    case 0: System.out.println("Zero"); break;
                    case 1: System.out.println("One"); break;
                    case 2: System.out.println("Two"); break;
                    case 3: System.out.println("Three"); break;
                    case 4: System.out.println("Four"); break;
                    case 5: System.out.println("Five"); break;
                    case 6: System.out.println("Six"); break;
                    case 7: System.out.println("Seven"); break;
                    case 8: System.out.println("Eight"); break;
                    case 9: System.out.println("Nine"); break;
                }
                count --;
            }
        }
    }
}
