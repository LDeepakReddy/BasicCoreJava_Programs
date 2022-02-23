package com.blz;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double t, v;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit value in the range of 0 - 50 : ");
        t = Sc.nextDouble();
        System.out.println("Enter the wind speed value in the range of 3 - 120  : ");
        v = Sc.nextDouble();

        if (t <= 50 && v <= 120 && v >= 3) {
            double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t) - (35.75)) * Math.pow(v, 0.16);
            System.out.println("Wind Chill value is : " + windChill);
        } else {
            System.out.println("Formula is not valid for this range");
        }
    }
}

