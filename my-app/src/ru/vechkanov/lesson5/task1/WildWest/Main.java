package ru.vechkanov.lesson5.task1.WildWest;



import java.util.Random;

public class Main {



    public static void main(String[] args) {
        // write your code here
        Covbows [] covbow;
        covbow = new Covbows[3];
        covbow[0] = new Covbows("Джон", 45);
        covbow[1] = new Covbows("Дэнни", 24);
        covbow[2] = new Covbows("Рой", 18);
        covbow[0].setWeapons("двухстволки");
        covbow[1].setWeapons("пистолет");
        covbow[2].setWeapons("рогатки");

        Indeans [] indean;
        indean = new Indeans[3];
        indean[0] = new Indeans("Светлая долина", 24);
        indean[1] = new Indeans("Черная вода", 52);
        indean[2] = new Indeans("Светлый ум", 19);
        indean[0].setWeapons("томагавк");
        indean[1].setWeapons("нож");
        indean[2].setWeapons("нож");


        System.out.print("\n\n\n--------------------------------------------------------\n\n\n");

        Fight(covbow, indean, 3);


    }

    private static void Fight(Covbows[] covbow, Indeans[] indean, int round) {
        Random random = new Random();
        int countDeathCovbows = 0;
        int countDeathIndeans = 0;
        int i = 0;

        System.out.println("Началась схватка между индийцами и ковбоями");
        while (i < round) {


            int whoFirst = random.nextInt(2);
            if (whoFirst == 1){
                System.out.println(covbow[i].shoot() + " и "+ indean[i].death());
                countDeathIndeans = ++ countDeathIndeans;

            } else {
                System.out.println(indean[i].shoot() + " и " + covbow[i].death());
                countDeathCovbows = ++ countDeathCovbows;
            }
            ++i;



        }
        System.out.print("\n\n\n--------------------------------------------------------\n\n\n");

        if (countDeathCovbows > countDeathIndeans) {
            System.out.print("Победили индейцы");
        } else if  (countDeathCovbows == countDeathIndeans) {
            System.out.print("Никто не победил");

        } else {System.out.println("Победили ковбои"); }

    }



}














