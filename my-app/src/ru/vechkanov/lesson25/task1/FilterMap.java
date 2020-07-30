package ru.vechkanov.lesson25.task1;


import java.util.Map;


public class FilterMap {



    public boolean isUnique(Map<String, String> map) {
        for (String value:map.values()){
            int countEqual = (int) map.entrySet().stream().filter(item -> item.getValue().equals(value)).count();
            if (countEqual >= 2) {
                return false;
            }

        }
        return true;
    }

}
