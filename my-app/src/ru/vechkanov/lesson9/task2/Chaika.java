package ru.vechkanov.lesson9.task2;

public class Chaika extends Animal implements Runner, Swimmer, Flyer{

    @Override
    public void run() {
        System.out.println(this.getName() + " бегает вокруг воды");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " летает над водой");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " плавает в воде");

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
