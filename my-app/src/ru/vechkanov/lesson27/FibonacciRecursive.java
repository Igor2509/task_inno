package ru.vechkanov.lesson27;

public class FibonacciRecursive implements Fibonacci{



    @Override
    public int numberFibonacci(int value) {
        if (value == 1 || value == 2) {
            return 1; }
        else if (value == 0) {
            return 0;
        } else {
        return numberFibonacci(value - 1) + numberFibonacci(value - 2); }
    }




}







