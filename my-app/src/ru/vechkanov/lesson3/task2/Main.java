package ru.vechkanov.lesson3.task2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigDecimal percentNdfl = new BigDecimal(0.83);
        String  inputSalary;
        for (;;) {
            System.out.println("Введите полученную зарплату в рублях:");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                inputSalary = sc.next();
                break;
            }
            System.out.println("Попробуйте еще раз");

        }
        BigDecimal salaryWithNdfl = percentNdfl.multiply(new BigDecimal(inputSalary)).setScale(2, BigDecimal.ROUND_CEILING);
        System.out.println("При начислении зарплаты " + inputSalary + " руб. \"на руки\" вы получите " +  salaryWithNdfl + " руб.");



    }
}

