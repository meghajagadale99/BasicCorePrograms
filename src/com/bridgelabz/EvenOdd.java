package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
        sc.close();
    }

}

