package ru.vechkanov.lesson30;




import java.util.LinkedHashMap;
import java.util.Map;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNoDuplicatsElements {
            String word;
            public FirstNoDuplicatsElements(String word) { this.word = word;}





            public void run() {


                Map<Character, Long> map = word.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new, Collectors.counting()));
                map.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
    }



}







