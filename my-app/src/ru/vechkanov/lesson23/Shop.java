package ru.vechkanov.lesson23;


import java.util.ArrayList;

import java.util.List;


public class Shop implements Basket{
    List<String> products;
    List<Integer> quantitys;

    public Shop() {
        products = new ArrayList<>();
        quantitys = new ArrayList<>();
    }


    @Override
    public void addProduct(String product, int quantity) {
        int temp;
        product =  product.toLowerCase().trim();
        if (products.contains(product)) {
            int numberProduct=products.indexOf(product);
            temp = quantitys.get(numberProduct);
            quantitys.set(numberProduct, temp+quantity);

        } else {
            products.add(product);
            quantitys.add(quantity);

        }
        System.out.println(quantitys.toString());
    }

    @Override
    public void removeProduct(String product) {
        int numberProduct = products.indexOf(product.toLowerCase().trim());
        if (products.contains(product)) {
            products.remove(numberProduct);
            quantitys.remove(numberProduct);
        } else {
            System.out.println("Указанный продукт отсутствует в продаже");
        }

    }

    @Override
    public List<String> getProducts() {
        return products;
    }

    @Override
    public void clear() {
         products.clear();
         quantitys.clear();
    }

    @Override
    public int getProductQuantity(String product) {
        product =  product.toLowerCase().trim();
        if (products.contains(product)) {
            int numberProduct = products.indexOf(product.toLowerCase().trim());
            return quantitys.get(numberProduct);
        } else {return 0;
        }

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        product =  product.toLowerCase().trim();
        if (products.contains(product)) {
            int numberProduct=products.indexOf(product);
            quantitys.set(numberProduct, quantity);
        } else {
            System.out.println("Указанный продукт отсутствует в корзине");
        }
    }
}
