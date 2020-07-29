package ru.vechkanov.lesson24;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class Programm {
    public void run() {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        SetCollection setCollection = new SetCollection();
        System.out.println(setCollection.removeEvenLength(set));
    }
}
