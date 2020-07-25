package ru.vechkanov.lesson21.task1;

public class App {
    int[][] array = {{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}};
    public void run() {
        ArrayToLeft arrayToLeft = new ArrayToLeft(array);
        arrayToLeft.print();
        arrayToLeft.toLeft();
        arrayToLeft.print();
    }
}
