package ru.vechkanov.lesson3.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputBenzinCount;
        int benzinPrice = 43;
        for (;;) {
        System.out.println("Введите количество литров для подсчета стоимости");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
                inputBenzinCount = sc.nextInt();
                break;
             }
        }
        int cost =  benzinPrice * inputBenzinCount;
        System.out.println("Стоимость " + inputBenzinCount + " л. бензина составляет " + cost + " рублей");






    }


}
