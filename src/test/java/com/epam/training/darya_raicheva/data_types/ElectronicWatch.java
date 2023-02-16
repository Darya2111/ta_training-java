package com.epam.training.darya_raicheva.data_types;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = (seconds % 3600) % 60;
        String hh = (h == 24) ? "0" : ""+h ;
        String mm = (m < 10) ? "0"+m : ""+m ;
        String ss = (s < 10) ? "0"+s : ""+s ;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
