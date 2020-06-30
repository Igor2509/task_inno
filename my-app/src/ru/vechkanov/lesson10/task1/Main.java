package ru.vechkanov.lesson10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст который нужно заменить:");
        Scanner scanner = new Scanner(System.in);
        String inputWorld = scanner.nextLine();
        Replace word = new Replace("\\b(Б|б)(Я|я)(К|к)(А|а)\\b",
                inputWorld);
        System.out.println(word.replace("[Запрещено цензурой]"));






    }




}
