package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

// напишите программу, которая:
//запрашивает на вход число-пароль
//если оно равно секретному числу, программа выводит: "Hello, Agent"
//в противном случае печатает: "Access denied".

public class MeetAnAgent {
    final static int PASSWORD = 133976;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = scanner.nextInt();
        if (pass == PASSWORD){
            System.out.println("Hello, Agent");
        } else{
            System.out.println("Access denied");
        }
    }
}
