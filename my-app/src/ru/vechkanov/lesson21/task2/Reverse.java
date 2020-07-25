package ru.vechkanov.lesson21.task2;

public class Reverse {
    public int[] array;

    public Reverse(int[]array) {
        this.array = array;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public void reverse(){

            for (int i = array.length-1, j=0; i >=array.length/2 ; i--,j++) {
                int value = array[j];
                array[j] = array[i];
                array[i] = value;
            }
        }
    }




