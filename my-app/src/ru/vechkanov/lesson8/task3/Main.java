package ru.vechkanov.lesson8.task3;


import java.util.ArrayList;
import java.util.Arrays;

import static ru.vechkanov.lesson8.task3.Convert.toAkt;

public class Main {
    public static void main(String[] args) {


        Dogovor dogovor = new Dogovor();
        dogovor.setNumberDogovor(1);
        dogovor.setDate("25 февраля 2010");
        ArrayList<String> spisokTovarov= new ArrayList<>(Arrays.asList("картошка", "свекла", "морковь", "огурец"));
        dogovor.setSpisokTovar(spisokTovarov);
        dogovor.setDestination("Василий Иванович");
        dogovor.setSource("Николай Петрович");
        dogovor.print();

        Akt akt = toAkt(dogovor);
        akt.print();
    }
}
