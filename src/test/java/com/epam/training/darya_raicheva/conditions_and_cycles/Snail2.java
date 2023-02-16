package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

public class Snail2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.nextLine();
        if (a >= h) {
            System.out.println(1);
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            int counter = 0;
            int passed = 0;
            while (passed < h) {
                counter++;
                passed = passed + a;
                if (passed >= h) {
                    break;
                } else {
                    passed = passed - b;
                }
            }
            System.out.println(counter);
        }
    }
}

