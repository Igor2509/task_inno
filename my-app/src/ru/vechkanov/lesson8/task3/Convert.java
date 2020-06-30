package ru.vechkanov.lesson8.task3;

public class Convert {



    public static Akt toAkt(Dogovor dogovor) {
        Akt akt = new Akt();
        akt.setNumberAkt(dogovor.getNumberDogovor());
        akt.setDate(dogovor.getDate());
        akt.setDestination(dogovor.getDestination());
        akt.setSource(dogovor.getSource());
        akt.setSpisokTovar(dogovor.getSpisokTovar());

        return akt;



    }



}
