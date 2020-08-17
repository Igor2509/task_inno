package ru.vechkanov.lesson31;






public class Programm {


    public void run() {
        String word = "2324";
        Pollindrom pollindromMoving = new PollindromMoving(word);
        Pollindrom pollindromRverse = new PollindromReverse(word);
        System.out.println(pollindromMoving.run());
        System.out.println(pollindromRverse.run());



        }

    }





