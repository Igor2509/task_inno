package ru.vechkanov.lesson2.task3;

public class Main {

        public static void main(String[] args) {

            if (args.length == 1) {
                int hours, min, sec;
                int inputSecond = Integer.parseInt(args[0]);
                hours = inputSecond / 3600;
                min = (inputSecond - hours * 3600) / 60;
                sec = (inputSecond - hours * 3600 - min * 60);

                System.out.printf("%d секунд = %d ч., %d мин., %d сек.", inputSecond, hours, min, sec);


            } else {
                System.out.println("Укажите значение");

            }
        }
}


