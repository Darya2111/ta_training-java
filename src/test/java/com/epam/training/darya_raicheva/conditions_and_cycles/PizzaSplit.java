package com.epam.training.darya_raicheva.conditions_and_cycles;
import java.util.Scanner;

// напишите программу, которая должна прочитать два значения из System.in:
// количество людей и количество кусочков в одной пицце.
// Гарантируется, что входные параметры — целые положительные числа.
// Программа должна напечатать минимальное количество пицц (не ноль), которое надо заказать,
// чтобы у всех было одинаковое количество ломтиков и не осталось ни одного лишнего.

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int friends = scanner.nextInt();
        int slices = scanner.nextInt();
        int pizzas = 1;
        int p = slices;
        while (friends>0){
            slices = p;
            slices *= pizzas;
            if(slices%friends == 0){
                break;
            }
            pizzas++;
        }
        System.out.println(pizzas);
    }
}
// допустим:
// 1) в пицце 6 кусков, друзей 5               Т.е. нам нужен общий знаменатель М (минимальный)
// 2) 5 кусков и 5 друзей                       который без остатка делится на дру и кус
// 3) 5 кусков и 3 друга

// нам понадобится в 1 варианте: 5 пицц
// во 2 варианте 1 пицца
// в 3 варианте 3 пиццы