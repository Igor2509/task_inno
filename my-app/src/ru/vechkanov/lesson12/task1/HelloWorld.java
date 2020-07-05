package ru.vechkanov.lesson12.task1;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            String test = null;
            test.equals("123");
        } catch (Throwable ex) {
            System.out.println("Возникла первая ошибка " + ex.toString());

        }
        try {
            int[] array = new int [5];
            System.out.println(array[6]);
        } catch (Throwable ex) {
            System.out.println("Возникла вторая ошибка " + ex.toString());
        }

        try {
            int i =5;
            if (i==5) {
                throw new NewExcept("Возникла третья ошибка i равно 5");
            }
        } catch (NewExcept except){
            System.out.println(except.getMessage());
        }


    }
}
