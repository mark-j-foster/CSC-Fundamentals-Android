package com.markjfoster.week_03;

public class Main {
    static double cToF(double celsius) {
        double fahrenheit = 9.0/5 * celsius + 32;
        return(fahrenheit);
    }
    static void displayDailyTemperatures(double lowF, double highF) {
        System.out.println("The low temp will be " + lowF
                + " degrees Fahrenheit and the high temperature will be "
                + highF + " degrees Fahrenheit.");
    }

    public static void main(String[] args) {
        double[] lows = {0.0, 2.3, 5.3};
        double[] highs = {7.8, 11.3, 15.6};
        for (int i = 0;  i < lows.length;  ++i) {
            double low = cToF(lows[i]);
            double high = cToF(highs[i]);
            displayDailyTemperatures(low, high);
        }
   }
}