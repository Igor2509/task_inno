package ru.vechkanov.lesson4.task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числo:");
        int firstNumber = 1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                firstNumber = scanner.nextInt();
                break;
            }
            System.out.println("Попробуйте еще раз");

        }
        for (int i = 1; i <= firstNumber; i++) {
            for (int k = 1; k <= 9; k++) {
                System.out.print(k * i + "\t");
            }
            System.out.println("");
        }
    }

}