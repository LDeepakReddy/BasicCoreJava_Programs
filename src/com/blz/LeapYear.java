package com.blz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Please enter year in 4 digits : ");
        Scanner Sc = new Scanner(System.in);
        int year = Sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(+year + " is Leap year");
        } else {
            System.out.println(+year + " is not a Leap year");
        }
    }
}
