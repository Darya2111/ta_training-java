package com.epam.training.darya_raicheva.arrays;

public class Number {
    public static void start(int number) {
        System.out.println("Old value of \"number\" into \"start\" method is:" + number); //5
        number = 3;
        System.out.println("New value of \"number\" into \"start\" method is:" + number); //3
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Old value of \"number\" into \"main\" method is:" + number); //5
        start(number);
        System.out.println("New value of \"number\" into \"main\" method is:" + number); //5
    }
}
