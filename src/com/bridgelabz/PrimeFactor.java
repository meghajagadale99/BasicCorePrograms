package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {

    public static void getPrimeFactor(int n) {
        int flag = 0;
        int check = 0;
        int findFactor = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                findFactor = i;
                for (int j = 2; j <= findFactor / 2; j++) {
                    if (findFactor % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(findFactor);
                    check = 1;
                }
            }
        }
        if (check == 0)
            System.out.println("No Prime Factor Found Except 1 and " + n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find PrimeFactor: ");
        int n = sc.nextInt();
        sc.close();
        getPrimeFactor(n);
    }
}

