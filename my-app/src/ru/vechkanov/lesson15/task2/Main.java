package ru.vechkanov.lesson15.task2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        recursive.recursiveMetod(new File("."), 0);
    }


}
