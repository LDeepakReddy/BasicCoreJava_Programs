package com.blz;


import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        System.out.println("Enter the alphabet");
        Scanner Sc = new Scanner(System.in);
        char Alphabet = (char) Sc.next().charAt(0);

        if (Alphabet == 'a' || Alphabet == 'e' || Alphabet == 'i' || Alphabet == 'o' || Alphabet == 'u')
            System.out.println(Alphabet + " is vowel");
        else
            System.out.println(Alphabet + " is consonant");

    }

}
