package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (checkYear(year))
            checkLeapYear(year);
        else
            System.out.println("Enter a valid four digit year");
        sc.close();
    }

    public static boolean checkYear(int year) {
        if (year <= 999)
            return false;
        return true;
    }

    public static void checkLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("The year is a leap year");
        else
            System.out.println("The year is not a leap year");
    }
}

