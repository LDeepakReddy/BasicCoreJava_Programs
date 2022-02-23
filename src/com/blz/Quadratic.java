package com.blz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a, b, c;
        double root1=0.0, root2=0.0;

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the a value:");
        a = Sc.nextInt();
        System.out.print("Enter the b value:");
        b = Sc.nextInt();
        System.out.print("Enter the c value:");
        c = Sc.nextInt();

        double delta = b * b - 4 * a * c;

            root1 = (-b + (Math.sqrt(delta))) / (2 * a);
            root2 = (-b - (Math.sqrt(delta))) / (2 * a);

        System.out.println("Roots of the quadratic equations are");
        System.out.println("Root1 : " +root1);
        System.out.println("Root2 : " +root2);
    }
}

