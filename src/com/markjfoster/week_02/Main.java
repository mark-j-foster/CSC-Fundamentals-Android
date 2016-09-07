package com.markjfoster.week_02;

/**
 * Created by mfoster33 on 9/6/2016.
 */
public class Main {
    public static void main(String[] args) {
        int temperatures[]  = {45, 29, 10, 22, 41, 28, 33};
        int probabilities[] = {95, 60, 25,  5,  0, 75, 90};
        String dayOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                              "Friday", "Saturday"};
        int tempThreshold = 32;
        int probThreshold = 50;
        for (int i = 0; i < temperatures.length; ++i) {
            if (temperatures[i] <= tempThreshold && probabilities[i] > probThreshold) {
                System.out.println("It's likely to snow on " + dayOfWeek[i]);
            }
        }
    }
}
