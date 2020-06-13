package ru.vechkanov.lesson4.task2;

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
        if (firstNumber > 0) {
            System.out.printf("Число %d положительное и ", firstNumber);
        } else if (firstNumber < 0) {
            System.out.printf("Число %d отрицательное и", firstNumber);
        } else {
            System.out.printf("Чсло %d нулевое и ", firstNumber);}


        System.out.println((firstNumber%2 == 0)? "четное":"нечетное");
    }

}

