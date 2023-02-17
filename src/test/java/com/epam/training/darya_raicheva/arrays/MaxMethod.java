package com.epam.training.darya_raicheva.arrays;

// напишите программу, которая должна получить массив значений типа int
// и вернуть его максимальное значение.
// Подробности:
// Входной массив гарантированно не будет пустым или null.
// Метод max не должен изменять массив.
// Входной массив может содержать любое значение типа int от Integer.MIN_VALUE до Integer.MAX_VALUE.

public class MaxMethod {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};
        int result = MaxMethod.max(array);
        System.out.println(result == 199); //true
    }
    public static int  max(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
}
