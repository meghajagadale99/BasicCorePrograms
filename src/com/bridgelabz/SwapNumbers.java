package com.bridgelabz;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String args[]) {
        int m, n, swap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M and N : ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Before swapping numbers: " + m + " " + n);
        swap = m;
        m = n;
        n = swap;
        System.out.println("After swapping: " + m + "  " + n);
        System.out.println();
        sc.close();
    }
}

