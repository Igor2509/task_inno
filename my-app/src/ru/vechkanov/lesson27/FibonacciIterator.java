package ru.vechkanov.lesson27;

public class FibonacciIterator implements Fibonacci {



    @Override
    public int numberFibonacci(int value) {
        int prev = 0;
        int next = 1;
        int sum;

        if (value == 1 || value == 2) {
            return 1; }
        else if (value == 0) {
            return 0; } else {
            for (int i = 2; i<=value; i ++){
                sum = prev;
                prev = next;
                next = sum + prev;
            }
        return  next;
        }
    }




}
