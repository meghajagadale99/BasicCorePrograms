package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headCount = 0, tailCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times FLIP the COIN");
        int coin_tossed = sc.nextInt();
        for (int i = 0; i < coin_tossed; i++) {
            if (Math.random() < 0.5) {
                tailCount++;
            } else {
                headCount++;
            }
        }
        int head = (headCount * 100) / coin_tossed;
        int tail = (tailCount * 100) / coin_tossed;
        System.out.println("Percentage of  Head =" + headCount + "%");
        System.out.println("Percentage of Tail " + tailCount + "%");

    }

}

