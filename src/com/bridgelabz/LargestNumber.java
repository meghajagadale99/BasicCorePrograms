package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a, b, c, largest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        temp = a > b ? a : b;//comparing a and b and storing the largest number in a temp variable
        largest = c > temp ? c : temp;//comparing the temp variable with c and storing the result in the variable
        System.out.println("The largest number is: " + largest);
    }
}

