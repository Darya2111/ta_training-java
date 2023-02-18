package com.epam.training.darya_raicheva.arrays;

import java.util.Arrays;

// реализуйте метод multiply.
// Метод принимает в качестве параметра прямоугольный целочисленный массив (матрицу) и
// возвращает его транспонированным.
// Рассмотрим целочисленную матрицу, представленную в виде прямоугольного массива. З
// адача состоит в том, чтобы транспонировать ее по главной диагонали.
// Результат транспонирования матрицы – это перевернутая по главной дагонали версия исходной матрицы.

public class MatrixTransposition {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposedMatrix = new int[n][m];
        for(int x = 0; x < n; x++) {
            for(int y = 0; y < m; y++) {
                transposedMatrix[x][y] = matrix[y][x];
            }
        }
        return transposedMatrix;
    }
    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
