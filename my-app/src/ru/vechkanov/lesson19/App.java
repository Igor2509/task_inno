package ru.vechkanov.lesson19;

import java.io.File;

public class App {
    public void run() {
        Cash cach = new Cash(new File("products.txt"));
        cach.input();
        cach.printCheque();
        cach.saveCheque("out.txt");
    }

}
