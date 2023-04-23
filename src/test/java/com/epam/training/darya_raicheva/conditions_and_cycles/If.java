package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

public class If {
        // программа должна принимать на вход начение и исходя из него - выдавать верный ответ
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value == 0){
                System.out.println("It's zero");
            }
        }
}
