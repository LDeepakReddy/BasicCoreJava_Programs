package com.blz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        n1 = Sc.nextInt();
        System.out.print("Enter the second number:");
        n2 = Sc.nextInt();
        System.out.print("Enter the third number:");
        n3 = Sc.nextInt();


        if (n1 > n2 && n1 > n3) {
            System.out.println(+n1 + " is Largest number ");
        } else if (n2 > n3) {
            System.out.println(+n2 + " is Largest number ");
        } else {
            System.out.println(+n3 + " is Largest number ");
        }

    }
}

