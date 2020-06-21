package ru.vechkanov.lesson6.task1;


import java.util.Scanner;

import static ru.vechkanov.lesson6.task1.Menu.*;

class Apparat {
    static int account;

    static public void Run() {
        while (true) {

            Menu numberDrink = menuDrink();
            cost(numberDrink);
            System.out.printf("На Вашем счету %d\n\n", account);


        }


    }


    public static Menu menuDrink() {
        System.out.print("Выберите напиток;\n");
        int number;

        int count = 0;
        Menu[] menu = new Menu[4];
        menu[0] = JUiCE;
        menu[1] = COFFE;
        menu[2] = TEA;
        menu[3] = CHOCOLATE;

        for (Menu drink : menu) {

            System.out.println(count + "  " + drink.getName() + " стоимость " + drink.getCoust());
            count++;

        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            number = scanner.nextInt();
            if (number >= menu.length) {
                System.out.println("попробуйте еще раз");
            } else {
                break;
            }
        }
        return menu[number];

    }

    public static void cost(Menu menu) {
        System.out.printf("нa вашем счету %d рублей внесите сумму для оплаты напитка:\n", account);
        Scanner scanner = new Scanner(System.in);
        int inputCost = scanner.nextInt();
        account += inputCost;
        while (true) {
            String inputOptions;
            if (account < menu.getCoust()) {
                System.out.println("У Вас не хватает денег\n Выберите следующию опцию:\n1 выбрать другой напиток\n2 внести еще денег");
                inputOptions = scanner.next();
                if (inputOptions.equals("2")) {
                    cost(menu);
                    break;
                } else if (inputOptions.equals("1")) {
                    break;
                }
            } else if (account >= menu.getCoust()) {
                System.out.println("Поздравляю вы приобрели " + menu.getName());
                account -= menu.getCoust();
                break;
            }
        }
    }

}


