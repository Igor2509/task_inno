package ru.vechkanov.lesson21.task1;

import java.lang.reflect.Array;

public class ArrayToLeft {
    public int[][] array;

    public ArrayToLeft(int[][] array) {
        this.array = array;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int d = 0; d < array[i].length; d++) {
                System.out.print(array[i][d] + " ");
            }
            System.out.println(" ");
        }
    }

    public void toLeft(){
        for (int i = 0; i < array.length; i++) {
            for (int d = 0; d < array[i].length-1; d++) {
                array[i][d] = array[i][d+1];
            }
            array[i][array[i].length-1]=0;
        }
    }



}
