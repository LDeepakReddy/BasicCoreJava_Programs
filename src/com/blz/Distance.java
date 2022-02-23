package com.blz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x, y;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the X co-ordinate:");
        x = Sc.nextInt();
        System.out.println("Enter the Y Co-ordinate :");
        y = Sc.nextInt();
        double Distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidean distance from the origin is " + Distance);
    }
}


