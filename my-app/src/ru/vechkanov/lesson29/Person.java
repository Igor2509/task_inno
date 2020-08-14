package ru.vechkanov.lesson29;

import java.util.Objects;

public class Person {
    String name;
    int age;
    String gender;

    public Person(int age, String name, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
         return 31 * (name.hashCode() + gender.hashCode() + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
