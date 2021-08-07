package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int PowerOfTwo = 1;
        System.out.println("Power Of Two " + n + " are: ");
        if (n > 0 && n < 31) {
            for (int i = 1; i <= n; i++) {
                PowerOfTwo = 2 * PowerOfTwo;
                System.out.println(PowerOfTwo);
            }
        } else {
            System.out.println("Enter number greater than 0 and less than 31");
        }
        sc.close();
    }
}
