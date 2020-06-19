package ru.vechkanov.lesson5.task1.WildWest;

public abstract class PeopleWildWeast {
    // Все жители Дикого запада имеет клички, возраст и могут носить оружие
    final private String nickname;
    private String weapons;


    PeopleWildWeast(String nickname, int age){
        this.nickname = nickname;
        System.out.printf("Привет я с Дикого Веста моя кличка %s, мой возраст %d", this.nickname, age);
    }

    public String getNickname() {
        return this.nickname;
    }




    // выбрать оружие для жителя Дикого запада
    protected void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    public String getWeapons(){
        return weapons;
    }


    // все жителя Дикого запада могут атаковать
    protected abstract String shoot();
    // все могут умирать
    protected abstract String death();




}

