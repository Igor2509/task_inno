package ru.vechkanov.lesson8.task1;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class User {

    private final String value1 = inputValue();
    private final String value2 = inputValue();


    private String inputValue() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            System.out.println("Введите значение:");
            String input;
            if (scanner.hasNextBigDecimal()) {
                input = scanner.next();
                return input;

            }

            System.out.println("Попробуйте еще раз");
        }
    }


    private BigDecimal action(String firstValue, String secondValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию:");
        String operation = scanner.next();
        BigDecimal result;

        switch (operation) {
            case "+":
                 result = Calc.plus(firstValue, secondValue);
                 break;

            case "-":
                result = Calc.minus(firstValue, secondValue);
                break;


            case "*":
                result = Calc.umnojenie(firstValue, secondValue);
                break;


            case ":":


            case "%":
                result =  Calc.delenie(firstValue, secondValue);
                break;

            default:
                System.out.println("Попробуйте еще раз");
                return action(firstValue, secondValue);

        }



        return result;

    }


    public void run() {
        BigDecimal result = action(value1, value2);
        System.out.println("Ваш результат:\n" + result);


    }


}