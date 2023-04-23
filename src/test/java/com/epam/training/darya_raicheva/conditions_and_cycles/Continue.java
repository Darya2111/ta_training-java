package com.epam.training.darya_raicheva.conditions_and_cycles;

public class Continue {
    public static void main(String[] args) {
        int value = 0;
        while (value++ <10) {
            if (value == 3 || value == 8) {
                continue;
            }
            System.out.println(value);
        }
    }
}
