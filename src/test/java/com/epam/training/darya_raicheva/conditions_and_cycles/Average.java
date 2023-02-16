package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

// считывает последовательность целочисленных значений из стандартного ввода
// и находит среднее значение

// Вы должны считывать значения последовательности, пока следующее не станет 0.
// Нулевое значение означает конец входной последовательности и не является ее частью.

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        int average = 0;
        do {
            n = scanner.nextInt();
            average++;
            sum += n;
        }
        while (n != 0);
            System.out.println(sum / (average-1));
        }
    }

