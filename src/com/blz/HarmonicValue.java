package com.blz;

import java.util.Scanner;

public class HarmonicValue {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        double sum = 0;
        double i;

        for (i = 1; i <= N; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("Harmonic value of " + N + " is " + sum);
    }

}

