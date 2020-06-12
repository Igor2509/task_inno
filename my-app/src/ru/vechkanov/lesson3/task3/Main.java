package ru.vechkanov.lesson3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hours, min, sec;
        int inputSecond;

        for (;;) {
             System.out.println("Введите секунды для преобразования в часы:");
             Scanner sc = new Scanner(System.in);
             if (sc.hasNextInt()) {
                 inputSecond = sc.nextInt();
                 break;
             }
             System.out.println("Попробуйте еще раз");

        }


        hours = inputSecond / 3600;
        min = (inputSecond - hours * 3600) / 60;
        sec = (inputSecond - hours * 3600 - min * 60);

        System.out.printf("%d секунд = %d ч. %d мин. %d сек.", inputSecond, hours, min, sec);




    }
}



