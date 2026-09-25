package com.chavvicalc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 0;
        double b = 0;

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

        input.close();
    }
}