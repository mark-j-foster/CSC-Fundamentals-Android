package com.markjfoster.week_03;

import com.sun.java_cup.internal.runtime.Scanner;

public class Main {
    static double fToC(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9;
        return(celsius);
    }
    static void displayTemperature(double temperature) {
        System.out.println("The temperature is " + temperature + ".");
    }

    static double userInput() {
        System.out.println("Enter a Fahrenheit temperature: ");
        Scanner scanner;
        scanner = new scanner(System.in);
        String input = scanner.nextLine;
        double doubleInput = Double.parseDouble(input);
        return(doubleInput);
    }
    public static void main(String[] args) {
        double userTemperature = userInput();
        while (userTemperature >= -460) {
            double celsius = fToC(userTemperature);
            userTemperature = userInput();
        }
    }
}