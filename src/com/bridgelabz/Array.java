package com.bridgelabz;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array {

    static Scanner scan = new Scanner(System.in);

    public static int[][] arrayInt(int m, int n) {
        int a[][] = new int[m][n];
        System.out.println();
        System.out.println("Integer Array");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        return a;
    }

    public static double[][] arrayDouble(int m, int n) {
        double b[][] = new double[m][n];
        System.out.println();
        System.out.println("Double Array");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scan.nextDouble();
            }
        }
        return b;
    }


    // display method
    public static void display(int[][] a, double[][] b, int m, int n) {
        PrintWriter pw = new PrintWriter(System.out, true);

        // display integers
        System.out.println();
        pw.println("2D ARRAY INTEGER");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pw.print("\t" + a[i][j] + " ");
            }
            pw.println("\t");
        }

        // display double
        System.out.println();
        pw.println("2D ARRAY DOUBLE");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pw.print("\t" + b[i][j] + " ");
            }
            pw.println("\t");
        }

    }
    //method for displaying 2d array

    <t> void displayArray(t[][] arr) {
        PrintWriter pw = new PrintWriter(System.out);

        // display integers
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                pw.print("\t" + arr[i][j] + " ");
            }
            pw.println("\t");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter number of rows: ");
        int m = scan.nextInt();
        System.out.println("Enter number of columns: ");
        int n = scan.nextInt();

        // calling methods
        int[][] a = arrayInt(m, n);
        double[][] b = arrayDouble(m, n);


        // calling display method
        display(a, b, m, n);

    }
}