package com.epam.training.darya_raicheva.arrays;

// реализуйте метод sum.
// Правильная реализация должна получить массив значений int и вернуть сумму четных чисел.
// Подробности:
// Если данный массив равен нулю или пуст, метод возвращает 0.
// Метод sum не должен изменять массив.
// Входной массив может содержать любое значение типа int от Integer.MIN_VALUE до Integer.MAX_VALUE.

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};
        System.out.println(sum(array));
    }
    public static int sum(int[] array){
        int sum =0;
        if (array.length == 0 || array == null)
            return 0;
        for(int i=0; i<array.length;i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
