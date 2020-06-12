package ru.vechkanov.lesson2.task2;
import java.math.BigDecimal;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal percentNdfl = new BigDecimal(0.83);
        if (args.length == 1) {
            String inputSalary = args[0];
            BigDecimal salaryWithNdfl = percentNdfl.multiply(new BigDecimal(inputSalary)).setScale(2, BigDecimal.ROUND_CEILING);
            System.out.println("При начислении зарплаты " + args[0] + " руб. \"на руки\" вы получите " +  salaryWithNdfl + " руб.");


        } else {
            System.out.println("Укажите начисленую зарплату в рублях");

        }
    }
}