package com.blz;

import java.text.BreakIterator;
import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        if (N <= 31) {

            for (int i = 0; i <= N; i++) {
                int power = (int) (Math.pow(2, i));
                System.out.println("2 power of " + i + " is " + power);
            }
        } else {
            System.out.println("Please  enter 0 to 31 only ");
        }
    }
}


