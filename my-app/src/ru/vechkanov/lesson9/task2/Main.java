package ru.vechkanov.lesson9.task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Hamster hamster = new Hamster();
        Chaika chaika = new Chaika();
        cat.setName("Kitty");
        dog.setName("Sharik");
        hamster.setName("Gosha");
        chaika.setName("Chaka");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(hamster);
        animals.add(chaika);


        for (Animal animal : animals
        ) {
            System.out.println(animal.getName());


        }
        ArrayList<Flyer> flays = new ArrayList<>();
        flays.add(chaika);
        for (Flyer flyer : flays
        ) {
            flyer.fly();
        }

        ArrayList<Swimmer> swims = new ArrayList<>();
        swims.add(chaika);
        swims.add(dog);
        swims.add(cat);
        swims.add(hamster);
        for (Swimmer swim : swims
        ) {
            swim.swim();
        }

        ArrayList<Runner> runs = new ArrayList<>();
        runs.add(chaika);
        runs.add(dog);
        runs.add(cat);
        runs.add(hamster);
        for (Runner run : runs
        ) {
            run.run();
        }


    }


}











































