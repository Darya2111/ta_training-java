package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

public class Switch {
    // программа должна принимать на вход начение и исходя из него - выдавать верный ответ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case 10:
                System.out.println("The discount will be 10%");
                break;
            case 100:
                System.out.println("The discount will be 30%");
                break;
            case 1000:
                System.out.println("The discount will be 60%");
                break;
            default:
                System.out.println("You don't get a discount");
            }
        }
    }
