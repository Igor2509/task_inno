package ru.vechkanov.lesson15.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileCommander fileCommander = new FileCommander("1.txt");

        fileCommander.renameFile("2.txt");
        fileCommander.copyFile("3.txt");
        fileCommander.deleteFile();
    }
}
