package ru.vechkanov.lesson8.task2;

public class Subject {
    private static int countSubject;

    public Subject() {
        countSubject ++;
        System.out.printf("Я субьект номер %d\n",  countSubject);

    }

    protected void getCountSubject() {
        System.out.println("Создано" + " " + countSubject + " " + "обьектов");
    }
}
