package com.epam.training.darya_raicheva.arrays;
import java.util.Arrays;

// Правильная реализация должна получить массив значений типа int и вернуть копию данного массива
// со всеми удаленными локальными максимумами. Исходный массив изменять нельзя.
// Локальный максимум — это элемент, который больше любого из его соседних элементов.
// Вам необходимо удалить элементы, которые являются локальными максимумами в исходном массиве.
// Подробности:
// Размер данного массива гарантированно больше 1.
// Данный массив гарантированно не равен null.
// Если у массива нет локальных максимумов, то вы должны вернуть его копию без изменений.


public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }
    public static int[] removeLocalMaxima(int[] array){

        //put your code here

        throw new UnsupportedOperationException();
    }
}
