package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Locale;
import java.util.Scanner;


// напишите программу для решения квадратных уравнений.
// Для заданных коэффициентов квадратного уравнения (ax² + bx + c = 0), верните один
// или два корня уравнения, если они существуют в области действительных чисел.
// Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out.
// Формат вывода:
// "x₁ x₂" (два корня в любом порядке, разделенные пробелом), если есть два корня
// "x" (просто значение корня), если есть единственный корень
// "no roots" (просто строковое значение "без корней"), если корня нет.

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(x1 +" "+ x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(x);
        }
        else {
            System.out.println("no roots");
        }
    }
}
