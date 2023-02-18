package com.epam.training.darya_raicheva.arrays;

import java.util.Arrays;

// реализуйте статические методы:
// void cycleSwap(int[] array)
// Сдвигает все элементы в данном массиве вправо на 1 позицию.
// В этом случае последний элемент массива становится первым.
// Например, 1 3 2 7 4 становится 4 1 3 2 7.
// void cycleSwap(int[] array, int shift)
// Сдвигает все элементы в заданном массиве вправо на shift позиций.
// Гарантируется, что значение сдвига неотрицательное и не больше длины массива.
public class CycleSwap {
    public static void main(String[] args){
        int[] array = new int[]{ 1, 3, 2, 7, 4 };
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));
    }
    static void cycleSwap(int[] array) {
        int shift = 5;
        CycleSwap.cycleSwap(array, shift);
    }
    static void cycleSwap(int[] array, int shift) {
        int[] arr2 = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = arr2[(array.length + i - shift) % array.length];
        }
    }
}
