package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        primeFactors(number);
    }

    private static boolean isPrime(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }

        }
        return prime;
    }

    private static void primeFactors(int primeFactors) {
        int i = 2;
        while (primeFactors > 1) {
            if (primeFactors % i == 0 && isPrime(i) == true) {
                System.out.println(i);
                primeFactors = primeFactors / i;
            }
            i++;
        }
    }
}