package ru.vechkanov.lesson2.task1;

public class Main {

    public static void main(String[] args) {
	    int benzinPrice = 43;
        if (args.length == 1) {
	      int benzinCount = Integer.parseInt(args[0]);
	      int cost =  benzinPrice * benzinCount;
	      System.out.println("Стоимость " + benzinCount + " л. бензина составляет " + cost + " рублей");


        } else {
           System.out.println("Укажите необходимое количество литров");

        }
      }
}

