package ru.vechkanov.lesson25.task1;

import ru.vechkanov.lesson25.task2.Basket;
import ru.vechkanov.lesson25.task2.Shop;

import java.util.Map;
import java.util.TreeMap;

public class Programm {
    public void run() {
           FilterMap filterMap = new FilterMap();
           Map<String, String> map = new TreeMap<>();
           map.put("Вася", "Иванов");
           map.put("Петр","Петров");
           map.put("Виктор","Сидоров");
           map.put("Сергей","Савельев");
           map.put("Вадим", "Викторов");
           System.out.println(filterMap.isUnique(map));
           map.clear();
           map.put("Вася", "Иванов");
           map.put("Петр","Петров");
           map.put("Виктор","Иванов");
           map.put("Сергей","Савельев");
           map.put("Вадим", "Петров");
           System.out.println(filterMap.isUnique(map));


    }

}
