package ru.vechkanov.lesson21.task2;

public class App {
    int[] array = {1,2,3,4,5,6,7,8,9,10};
    public void run() {
        Reverse reverse = new Reverse(array);
        reverse.print();
        reverse.reverse();
        reverse.print();
    }
}
