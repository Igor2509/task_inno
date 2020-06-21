package ru.vechkanov.lesson6.task1;

public enum Menu {
    JUiCE("cok", 100), COFFE("коффе", 50), TEA("чай", 25), CHOCOLATE("шоколад", 150);

    private String name;
    private int coust;



    Menu(String name, int coust) {
        this.name = name;
        this.coust = coust;



    }

    public String getName() {
        return name;
    }

    public int getCoust() {
        return coust;
    }


}
