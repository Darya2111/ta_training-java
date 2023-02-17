package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

// Дано следующее условие: улитка поднимается по дереву на a футов в день.
// Затем каждую ночь улитка сползает вниз на b футов. Высота дерева — h футов.

// напишите программу с подсчетом количества дней, которые потребуются улитке,
// чтобы добраться до вершины дерева.

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.nextLine();
        int days;
        if (a >= h) {
            System.out.println(1);
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            days = (h-b)/(a-b);
            System.out.println(days);
        }
    }
}

