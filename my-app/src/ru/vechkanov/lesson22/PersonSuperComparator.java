package ru.vechkanov.lesson22;

import java.util.Comparator;
import java.util.function.Function;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result;
        result =  o1.getName().compareTo(o2.getName());
        if (result != 0) return result;
        result = Integer.compare(o1.getAge(), o2.getAge());
        return result;
    }


}
