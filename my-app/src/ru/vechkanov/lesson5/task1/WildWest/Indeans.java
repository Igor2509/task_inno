package ru.vechkanov.lesson5.task1.WildWest;

public class Indeans extends PeopleWildWeast {



    Indeans (String nickname, int age)  {
        super(nickname, age);
        System.out.println("  и я индеец");
    }


    @Override
    public String shoot() {

        return String.format( "%s метнул %s", super.getNickname(), super.getWeapons());
    }



    @Override
    public String death() {

        return String.format("%s умер", super.getNickname());


    }


}







