package ru.vechkanov.lesson9.task1;

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


        for (Animal animal: animals
             ) {
            System.out.println(animal.getName());
        }
    }
}














































