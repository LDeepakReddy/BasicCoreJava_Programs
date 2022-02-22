package com.blz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number to check even or odd : ");
        int N=Sc.nextInt();

        if (N%2 == 0){
            System.out.println(+N+ " is  even" );

        }else{
            System.out.println(+N+ " is Odd ");
        }


    }
}
