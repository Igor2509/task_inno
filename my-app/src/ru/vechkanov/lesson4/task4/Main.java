package ru.vechkanov.lesson4.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел в прогрессии:");
        int count;
        int begin = 1;
        int d = 2;
        int number;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                break;

            }

            System.out.println("Попробуйте еще раз");
        }
        System.out.print("Числа арифмитической прогрессии: ");
        for (int i = 1; i <= count; i++) {
            number = begin + d * (i - 1);
            System.out.print(number + "  ");


        }
        System.out.print("\nЧисла геометрической прогрессии: ");
        for (int i = 1; i <= count; i++){
            number = (int) (begin * Math.pow(d, (i-1)));
            System.out.print(number + "  ");

        }

    }
}