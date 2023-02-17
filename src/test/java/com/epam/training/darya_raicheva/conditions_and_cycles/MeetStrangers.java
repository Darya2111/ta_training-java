package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.io.IOException;
import java.util.Scanner;

// напишите простую программу, которая:
//запрашивает количество незнакомцев, с которыми нужно встретиться
//построчно читает имена незнакомцев
//построчно выводит: "Hello, (имя незнакомца)" для каждого незнакомца.

public class MeetStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.nextLine();
        if (amount > 0){
            String[] word = new String[amount];
            for (int i = 0; i < amount; i++) {
                word[i] = scanner.nextLine();
            }
            for (int i = 0; i < amount; i++) {
                System.out.println("Hello, " + word[i]);
            }
        } else if (amount == 0){
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
