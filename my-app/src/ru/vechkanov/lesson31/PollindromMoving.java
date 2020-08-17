package ru.vechkanov.lesson31;


import java.util.*;
import java.util.stream.Collectors;

public class PollindromMoving  implements  Pollindrom{
    public String word;

    public PollindromMoving(String word) {
        this.word = word;
    }

    @Override
    public boolean run() {

        Deque<Character> deque = word.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayDeque::new));
        for (int i = 0; i <= deque.size() / 2; i++) {
          if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }

        }
        return true;
    }
}




