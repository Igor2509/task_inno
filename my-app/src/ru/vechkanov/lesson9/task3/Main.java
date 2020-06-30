package ru.vechkanov.lesson9.task3;

public class Main {
    public static void main(String[] args) {
        ThinMan thin = new ThinMan();
        FatMan fat = new FatMan();
        thin.setName("Gor");
        fat.setName("Dor");
        thin.run();
        thin.swim();
        fat.swim();
        fat.run();
    }
}
