package ru.vechkanov.lesson3.task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberRiddle = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int inputChislo = 0;
        int numberRiddleComparison = numberRiddle;
        System.out.println("Давай поиграем в игру \"Горячо-Холодно\", для выхода набери любое слово");

        for (;;) {
            System.out.println("Введи число:");
            if (scanner.hasNextInt()) {
                inputChislo = scanner.nextInt();
                } else {break;}
            int diff=Math.abs(numberRiddle - inputChislo);
            if (numberRiddle == inputChislo) {
                System.out.println ("ура вы победили");
                break;
            } else if (diff <= numberRiddleComparison) {
                System.out.println("горячо");
                numberRiddleComparison = diff;
            } else { System.out.println("холодно");

            }
        }
    }
}