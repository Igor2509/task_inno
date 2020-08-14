package ru.vechkanov.lesson27;



public class Programm {
    public void run() {

        printFibonacci(20, new FibonacciRecursive());
        printFibonacci(20, new FibonacciIterator());

    }






    public void printFibonacci(int limit, Fibonacci fibonacci) {
        int result;
        int count = 0;
        while (true) {
            result = fibonacci.numberFibonacci(count);
            System.out.println(result);
            if (count == limit) {
                break;
            } else {
                count++;
            }


        }
    }
}