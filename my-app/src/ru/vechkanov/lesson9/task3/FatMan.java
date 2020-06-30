package ru.vechkanov.lesson9.task3;

public class FatMan extends Man {
    @Override
    public void swim() {
        System.out.println(super.getName() + " плавает");
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " бегает");
    }
}
