package ru.vechkanov.lesson9.task3;

public abstract class Man implements Runner, Swimmer{
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
           }

    @Override
    public void swim() {
    }
}
