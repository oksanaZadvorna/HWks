package com.syntax.reviewClasses;

import java.util.Scanner;

public class scannerLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter int value");
        int sum = 0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += num;

        }
        System.out.println("Sum="+sum);
    }
}
