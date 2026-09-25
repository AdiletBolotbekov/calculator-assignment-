package com.chavvicalc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 0;
        double b = 0;
        String command = "";

        while (!command.equals("q")) {
            System.out.println();
            System.out.println("Welcome to ChavviCalc!");
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println();
            System.out.println("a - Enter a value for A");
            System.out.println("b - Enter a value for B");
            System.out.println("+ - Add");
            System.out.println("- - Subtract");
            System.out.println("* - Multiply");
            System.out.println("/ - Divide");
            System.out.println("= - Display values");
            System.out.println("c - Clear");
            System.out.println("q - Quit");
            System.out.print("Enter command: ");

            command = input.nextLine().trim();

            if (command.equals("a")) {
                System.out.print("Enter value for A: ");
                try {
                    a = Double.parseDouble(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number.");
                }
            }
            else if (command.equals("b")) {
                System.out.print("Enter value for B: ");
                try {
                    b = Double.parseDouble(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number.");
                }
            }
            else if (command.equals("+")) {
                a = a + b;
            }
            else if (command.equals("-")) {
                a = a - b;
            }
            else if (command.equals("*")) {
                a = a * b;
            }
            else if (command.equals("/")) {
                if (b != 0) {
                    a = a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            }
            else if (command.equals("=")) {
                System.out.println("A = " + a);
                System.out.println("B = " + b);
            }
            else if (command.equals("c")) {
                a = 0;
                b = 0;
            }
            else if (!command.equals("q")) {
                System.out.println("Error: Invalid command.");
            }
        }

        System.out.println("Goodbye!");
        input.close();
    }
}