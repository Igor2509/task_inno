package ru.vechkanov.lesson25.task2;


import java.util.*;



public class Shop implements Basket {
    Map<String, Integer> products;


    public Shop() {
        products = new HashMap<>();

    }


    @Override
    public void addProduct(String product, int quantity) {
        product =  product.toLowerCase().trim();
        if (products.containsKey(product)) {
            products.computeIfPresent(product,(key, value) -> value+quantity);

        } else {
            products.put(product, quantity);


        }

    }

    @Override
    public void removeProduct(String product) {
        product =  product.toLowerCase().trim();
        if (products.containsKey(product)) {
            products.remove(product);

        } else {
            System.out.println("Указанный продукт отсутствует в продаже");
        }

    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());

    }

    @Override
    public void clear() {
         products.clear();

    }

    @Override
    public int getProductQuantity(String product) {
        product =  product.toLowerCase().trim();
        return products.getOrDefault(product, 0);

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        product =  product.toLowerCase().trim();
        if (products.containsKey(product)) {
            products.computeIfPresent(product,(key, value) -> quantity);

        } else {
            System.out.println("Указанный продукт отсутствует в корзине");
        }
    }
}
