package ru.vechkanov.lesson9.task2;

public class Cat extends Animal implements Runner, Swimmer{
    @Override
    public void run() {
        System.out.println(this.getName() + " бегает за мышами");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " плавает в ванной");

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


