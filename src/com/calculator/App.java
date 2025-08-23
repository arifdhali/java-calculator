package com.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            System.out.println("\n============ Console Calculator ============");
            System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide  5. Exit");
            System.out.print("Choose operation: ");

            int choose = sc.nextInt();
            if (choose == 5) {
                break;
            }

            System.out.println("Enter first number");
            int firstN = sc.nextInt();
            System.out.println("Enter second number");
            int secondN = sc.nextInt();
            int result = 0;
            switch (choose) {
                case 1:
                    result = cal.sum(firstN, secondN);
                    break;
                case 2:
                    result = cal.substract(firstN, secondN);
                    break;

                case 3:
                    result = cal.multiply(firstN, secondN);
                    break;

                case 4:
                    result = cal.divide(firstN, secondN);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.print("============");
            System.out.print("Answer: " + result);
        }
    }
}
