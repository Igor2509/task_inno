package ru.vechkanov.lesson8.task3;

import java.util.ArrayList;

public class Dogovor implements Printable, Convertable{
    private int numberDogovor;
    private String date;
    private ArrayList<String> spisokTovar;
    private String destination;
    private String source;





    public String getDestination() {
        return destination;
    }

    public String getSource() {
        return source;
    }

    public int getNumberDogovor() {
        return numberDogovor;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<String> getSpisokTovar() {
        return spisokTovar;
    }

    public void setNumberDogovor(int numberDogovor) {
        this.numberDogovor = numberDogovor;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSpisokTovar(ArrayList<String> spisokTovar) {
        this.spisokTovar = spisokTovar;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSource(String source) {
        this.source = source;
    }



    @Override
    public void print() {
        System.out.printf("Договор купли-продажи № %d\n", getNumberDogovor());
        System.out.printf("дата подписания %s\n", getDate());
        System.out.printf("Настоящий договор о том, что я %s покупаю товар, который продает мне %s\n", getDestination(), getSource());
        System.out.println("Список товара следующий:");
        for (String tovar : getSpisokTovar()) {
            System.out.println(tovar);
        }


    }
    @Override
    public Akt toAkt() {
        Akt akt = new Akt();
        akt.setNumberAkt(this.getNumberDogovor());
        akt.setDate(this.getDate());
        akt.setDestination(this.getDestination());
        akt.setSource(this.getSource());
        akt.setSpisokTovar(this.getSpisokTovar());

        return akt;




    }







}