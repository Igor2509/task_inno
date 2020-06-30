package ru.vechkanov.lesson10.task1;

public class Replace {
    private final String pattern;
    private final String inputWord;

    public Replace(String pattern, String inputWord) {
        this.inputWord = inputWord;
        this.pattern = pattern;
    }


    public String replace (String zamenaWord) {
        return inputWord.replaceAll(pattern, zamenaWord);


    }
}
