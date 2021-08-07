package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet check whether is a vowel or consonant: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Alphabet " + ch + " is a Vowel");
        } else {
            System.out.println("Alphabet " + ch + " is a Consonant");
        }
        sc.close();

    }

}


