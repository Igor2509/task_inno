package ru.vechkanov.lesson4.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два числа:");
        int firstNumber;
        int secondNumber;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt() && scanner.hasNextInt()){
                firstNumber = scanner.nextInt();
                secondNumber = scanner.nextInt();
                break;}
            System.out.println("Попробуйте еще раз");
        }

        if (firstNumber > secondNumber){
            System.out.printf("Миннимальное число %d\n", secondNumber);
        } else if (secondNumber == firstNumber) {
            System.out.println("оба числа равны");
        } else {System.out.printf("Миннимальное число %d\n", firstNumber);}

    }
}


