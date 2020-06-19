package ru.vechkanov.lesson5.task1.WildWest;



public class Covbows extends PeopleWildWeast {



    Covbows (String nickname, int age)  {
        super(nickname, age);
        System.out.println(" и я ковбой");
    }









    @Override
    public String shoot() {
        return String.format("%s стрельнул из %s", super.getNickname(), super.getWeapons());
    }


    @Override
    public String death() {

        return String.format("%s умер", super.getNickname());

    }


}
