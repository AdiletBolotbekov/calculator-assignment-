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

            command = input.nextLine();

            if (command.equals("a")) {
                System.out.print("Enter value for A: ");
                a = Double.parseDouble(input.nextLine());
            } 
            else if (command.equals("b")) {
                System.out.print("Enter value for B: ");
                b = Double.parseDouble(input.nextLine());
            }
        }

        System.out.println("Goodbye!");
        input.close();
    }
}