package ru.vechkanov.lesson24;


import java.util.Set;
import java.util.TreeSet;

public class SetCollection {


    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> newSet = new TreeSet<>();
        for (String item : set) {
            if (!(item.length() % 2 == 0)) {
                newSet.add(item);

            }


        }


        return newSet;

    }

}
