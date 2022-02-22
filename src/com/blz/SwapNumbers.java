package com.blz;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = Sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = Sc.nextInt();
        System.out.println("Entered numbers are " + a + " and " + b);

        int c; // temparory variable
        //swaping the numbers"

        c = a;
        a = b;
        b = c;

        System.out.println("numbers after Swaping " + a + " and " + b);


    }
}
