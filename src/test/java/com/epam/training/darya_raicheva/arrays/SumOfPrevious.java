package com.epam.training.darya_raicheva.arrays;

import java.util.Arrays;

// реализуйте метод getSumCheckArray.
// Правильная реализация должна получить массив значений int и вернуть массив логических значений,
// где каждый элемент является результатом проверки: является ли соответствующий исходный элемент
// суммой двух предыдущих элементов в данном массиве.
// Подробности:
// Гарантируется, что длина данного массива составляет 2 или более.
// Данный массив гарантированно не равен null.
// Метод возвращает массив логических значений, где каждый элемент является результатом
// для соответствующего элемента в данном массиве.
// Первые два элемента логического массива всегда false.


public class SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }
    public static boolean[] getSumCheckArray(int[] array){
        boolean [] array2 = new boolean[array.length];
        for(int i=0; i<array.length;i++) {
            if(array[i]==array[0] || array[i]==array[1]){
                array2[1] = false;
            } else if (array[i] == array[i-2]+array[i-1]) {
                    array2[i] = true;
                } else {
                array2[i] = false;
             }
            }
        return array2;
    }
}
