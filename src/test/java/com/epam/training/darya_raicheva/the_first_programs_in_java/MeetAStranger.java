package com.epam.training.darya_raicheva.the_first_programs_in_java;

// напишите программу, которая прочтет строку из System.in и выведет сообщение: "Hello, прочитанная строка".
//Если во входной строке несколько слов, нужно напечатать их все.

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Hello, " + input);
    }

}
