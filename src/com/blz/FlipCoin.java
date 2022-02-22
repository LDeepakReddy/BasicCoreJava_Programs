package com.blz;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {
        System.out.println("How many times you want to flip the coin ");
        Scanner Sc = new Scanner(System.in);
        int flips = Sc.nextInt();

        int heads = 0, tails = 0, coin = 1;
        double HeadsPercentage, TailsPercentage;

        while (coin <= flips) {
            double random = Math.random();
            if (random < 0.5) {
                tails++;
                System.out.println("It is Tails");
            } else {
                heads++;
                System.out.println("It is heads");
            }
            coin++;
        }
        System.out.println("Heads flipped " + heads + " times  And tails flipped " + tails + " times");
        HeadsPercentage = (double) ((heads * 100) / flips);
        TailsPercentage = 100 - HeadsPercentage;
        System.out.println("Heads percentage is " + HeadsPercentage + " %");
        System.out.println("Tails percentage is " + TailsPercentage + " %");
    }
}