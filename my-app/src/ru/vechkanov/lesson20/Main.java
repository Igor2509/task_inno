package ru.vechkanov.lesson20;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        Json json = new Json();
        json.run("8.8.8.8");
        json.run("88.77.8.8");
    }
}
