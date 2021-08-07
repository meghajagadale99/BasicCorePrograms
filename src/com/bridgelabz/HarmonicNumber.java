package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double result = 0;
        double num = 0;
        double i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth value to find harmonic value: ");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            num = num + (1 / i);
            result = num;
        }
        System.out.println("The value of harmonic no. " + n + " is: " + result);
        sc.close();
    }
}
