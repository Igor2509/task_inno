package ru.vechkanov.lesson24;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Programm {
    public void run() {
        Set<String> set = new TreeSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        SetCollection setCollection = new SetCollection();
        System.out.println(setCollection.removeEvenLength(set));
    }
}
