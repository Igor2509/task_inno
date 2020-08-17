package ru.vechkanov.lesson31;

public class PollindromReverse  implements Pollindrom{


    public String word;



    public PollindromReverse(String word) {
        this.word = word;
    }


    @Override
    public boolean run() {

        StringBuilder wordBuilder = new StringBuilder(word);
        String wordReverse = wordBuilder.reverse().toString();
        return word.equals(wordReverse);

    }





}



