package com.blz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = Sc.nextInt();
        System.out.println("Enter b");
        int b = Sc.nextInt();

        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);

    }
}
