package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

// последовательность целочисленных значений из стандартного вывода и находит максимальное из них
// считывать значения последовательности, пока следующее не станет 0
// Нулевое значение означает конец входной последовательности и не является ее элементом.

public class MaxValueInSequence {
    public static int max() {
        Scanner scnr = new Scanner(System.in);
        int currValue = scnr.nextInt();
        int maxSoFar = currValue;
        while (true) {
            currValue = scnr.nextInt();
            if(currValue==0)break;
            if (currValue >= maxSoFar ) {
                maxSoFar = currValue;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        MaxValueInSequence test = new MaxValueInSequence();
        System.out.println(max());
    }
}
