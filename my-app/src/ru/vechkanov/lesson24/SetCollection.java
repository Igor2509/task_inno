package ru.vechkanov.lesson24;



import java.util.LinkedHashSet;
import java.util.Set;


public class SetCollection {


    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> newSet = new LinkedHashSet<>();
        for (String item : set) {
            if (!(item.length() % 2 == 0)) {
                newSet.add(item);

            }


        }


        return newSet;

    }

}
