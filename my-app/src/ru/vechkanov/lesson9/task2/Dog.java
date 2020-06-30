package ru.vechkanov.lesson9.task2;

public class Dog extends Animal implements Runner, Swimmer {

    @Override
    public void run() {
        System.out.println(this.getName() + " бегает вокруг будки");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " плавает в водоемах");

    }
    @Override
    public void setName(String name) {
        super.name = name;



    }

    @Override
    public String getName() {
        return super.name;

    }
}
