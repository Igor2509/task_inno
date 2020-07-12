package ru.vechkanov.lesson15.task2;

import java.io.File;
import java.util.*;

public class Recursive {




    public void recursiveMetod(File file, int depth) {


        List<File> listOfFile;

        listOfFile = Arrays.asList(Objects.requireNonNull(file.listFiles()));
        Collections.sort(listOfFile);



        ++ depth;


        for (File f : listOfFile) {
            if (!f.isDirectory()) {
                for (int i = 0; i<depth; ++i) {
                    System.out.print(" ");}
                System.out.println(f.getName());
            } else if (file.isDirectory()) {
                for (int i = 0; i<depth; ++i) {
                    System.out.print(" ");
                }
                System.out.println(f.getName());

                recursiveMetod(f, depth);
            }
        }
    }
}