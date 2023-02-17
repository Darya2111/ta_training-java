package com.epam.training.darya_raicheva.conditions_and_cycles;

import java.util.Scanner;

// напишите программу, которая считывает общую сумму счета и количество друзей,
// а затем выводит размер части оплаты (счет + 10% чаевые).

public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        int friends = scanner.nextInt();
      //  scanner.nextLine();
        if (check < 0) {
            System.out.println("Bill total amount cannot be negative");
        } if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            System.out.println((int)Math.ceil(check*1.1/friends));
        }
    }
}
