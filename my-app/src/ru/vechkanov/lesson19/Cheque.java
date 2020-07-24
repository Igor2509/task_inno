package ru.vechkanov.lesson19;

public class Cheque {
   private final String name;
   private final float count;
   private final float price;

    public Cheque(String name, float price, float count) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }




}
