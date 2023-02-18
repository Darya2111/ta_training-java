package com.epam.training.darya_raicheva.arrays;

import java.util.Arrays;

// реализуйте метод multiply.
// Метод берет два прямоугольных целочисленных массива (матрицы) и возвращает результат их умножения.
// Рассмотрим две целочисленные матрицы, представленные в виде прямоугольных массивов.
// Задача – перемножить данные матрицы. При таком умножении элементы в i-й строке матрицы A
// умножаются на соответствующие элементы в j-м столбце матрицы B,
// а сумма полученных значений сохраняется в ij-й элемент результирующей матрицы.
// Обратите внимание, что количество столбцов в первой матрице равно количеству строк во второй матрице.

public class MatricesMultiplication {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int a = matrix1.length;
        int b = matrix2[0].length;
        int o = matrix2.length;
        int[][] multiply = new int[b][a];
        if (a != b) {
            return null;
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < o; k++) {
                    multiply[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multiply;
    }
    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}};
        int[][] b = {
                {7, 8},
                {9, 10},
                {11, 12}};
        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
