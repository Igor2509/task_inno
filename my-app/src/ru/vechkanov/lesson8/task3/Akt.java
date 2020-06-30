package ru.vechkanov.lesson8.task3;

import java.util.ArrayList;

public class Akt implements Printable {
    private int numberAkt;
    private String date;
    private ArrayList<String> spisokTovar;
    private String destination;
    private String source;


    public void setNumberAkt(int numberAkt) {
        this.numberAkt = numberAkt;
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

    public int getNumberAkt() {
        return numberAkt;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<String> getSpisokTovar() {
        return spisokTovar;
    }

    public String getDestination() {
        return destination;
    }

    public String getSource() {
        return source;
    }

    @Override
    public void print() {
        System.out.printf("Акт приема-передачи № %d\n", getNumberAkt());
        System.out.printf("дата подписания акта %s\n", getDate());
        System.out.printf("Настоящий акт о том, что я %s передал товар, который принял у меня %s\n", getDestination(), getSource());
        System.out.println("Список товара следующий:");
        for (String tovar : getSpisokTovar()) {
            System.out.println(tovar);
        }


    }
}
