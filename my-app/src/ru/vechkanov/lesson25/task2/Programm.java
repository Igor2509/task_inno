package ru.vechkanov.lesson25.task2;

public class Programm {
    public void run() {
        Basket basket = new Shop();
        basket.addProduct("Хлеб", 3);
        basket.addProduct("     хлеб", 1);
        basket.addProduct("Молоко", 4);
        System.out.println(basket.getProductQuantity("МОЛОКО"));
        System.out.println(basket.getProductQuantity("Хлеб"));
        basket.updateProductQuantity("Хлеб", 100);
        System.out.println(basket.getProductQuantity("Хлеб"));
        basket.removeProduct("хлеб");
        for (String product:basket.getProducts())
        {System.out.println(product);}
        basket.clear();
        System.out.println(basket.getProducts().size());
    }

}
