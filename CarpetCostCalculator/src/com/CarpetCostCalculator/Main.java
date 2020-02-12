package com.CarpetCostCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Length and width of floor: ");
        double length = obj.nextDouble();
        double width = obj.nextDouble();

        Floor floor = new Floor(length, width);

        System.out.print("Enter Cost Carpet per square feet:");
        double cost = obj.nextDouble();

        Carpet carpet = new Carpet(cost);

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Total Amount: " + calculator.getTotalCost());

    }
}
