package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

public class DoWhile {
    // программа должна принимать на вход начение и исходя из него - выдавать верный ответ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        do{
            System.out.println("Iteration:" + value);
            value ++;
        } while (value>4 && value<10);
    }
}
