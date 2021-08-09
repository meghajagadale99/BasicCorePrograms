package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    static void primeFactor(int number) {
        int i = 2;
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(i);
                while (number % i == 0)
                    number /= i;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter  a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        primeFactor(number);
    }
}