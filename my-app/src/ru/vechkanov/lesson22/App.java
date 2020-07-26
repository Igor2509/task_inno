package ru.vechkanov.lesson22;

import java.util.ArrayList;

import java.util.List;

public class App {
    public void run() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Вова",20));
        persons.add(new Person("Вова",16));
        persons.add(new Person("Артем",28));
        persons.add(new Person("Артем",9));
        persons.sort(new PersonSuperComparator());
        for (Person person: persons
             ) {
            System.out.println(person.toString());

        }

    }
}
