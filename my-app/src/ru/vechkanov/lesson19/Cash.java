package ru.vechkanov.lesson19;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Cash {
    List<Cheque> cheques = new ArrayList<>();
    File fileinput;

    public Cash(File fileinput) {
        this.fileinput = fileinput;
    }


    public void input() {
        Scanner sc;
        Locale.setDefault(Locale.US);
        try {
            sc = new Scanner(fileinput);
            while (sc.hasNext() || sc.hasNextFloat()) {
                String name = sc.nextLine();
                float count = sc.nextFloat();
                float price = sc.nextFloat();
                sc.nextLine();
                cheques.add(new Cheque(name, price, count));


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public String repeat(String str, int count) {
        StringBuilder strResult = new StringBuilder();
        for (int i = 0; i < count; i++) {
            strResult.append(str);
        }
        return strResult.toString();

    }


    public void printCheque() {
        float totalCoast = 0;
        Pattern int_pattern = Pattern.compile(".*\\.0*");
        System.out.printf("%s%12s%8s%14s%n", "Наименование", "Цена", "Кол-во", "Стоимость");
        System.out.println(repeat("=", 47));
        Locale.setDefault(Locale.forLanguageTag("RU"));
        for (Cheque cheque : cheques
        ) {

            String cost = String.format(Locale.US, "%.2f", (float) (cheque.getCount() * cheque.getPrice()));
            totalCoast = totalCoast + Float.parseFloat(cost);
            if (!(int_pattern.matcher(String.format(Locale.US, "%f", cheque.getCount())).matches())) {
                System.out.printf("%-18s%6.2f x %5.3f%15s%n", cheque.getName(), cheque.getPrice(), cheque.getCount(), String.format("%s%s", "=", cost));

            } else {

                System.out.printf("%-18s%6.2f x %5d%15s%n", cheque.getName(), cheque.getPrice(), (int) cheque.getCount(), String.format("%s%s", "=", cost));
            }

        }
        System.out.println(repeat("=", 47));
        System.out.printf("%s%41.2f", "Итого:", totalCoast);
    }


    public void saveCheque(String filename) {
        try(FileWriter writer = new FileWriter(filename, false))
        {
            float totalCoast = 0;
            Pattern int_pattern = Pattern.compile(".*\\.0*");
            writer.write(String.format("%s%12s%8s%14s%n", "Наименование", "Цена", "Кол-во", "Стоимость"));

            writer.write(repeat("=", 47));
            writer.append("\n");
            Locale.setDefault(Locale.forLanguageTag("RU"));
            for (Cheque cheque : cheques
            ) {

                String cost = String.format(Locale.US, "%.2f", (float) (cheque.getCount() * cheque.getPrice()));
                totalCoast = totalCoast + Float.parseFloat(cost);
                if (!(int_pattern.matcher(String.format(Locale.US, "%f", cheque.getCount())).matches())) {
                    writer.write(String.format("%-18s%6.2f x %5.3f%15s%n", cheque.getName(), cheque.getPrice(), cheque.getCount(), String.format("%s%s", "=", cost)));

                } else {

                    writer.write(String.format("%-18s%6.2f x %5d%15s%n", cheque.getName(), cheque.getPrice(), (int) cheque.getCount(), String.format("%s%s", "=", cost)));
                }

            }
            writer.write(repeat("=", 47));
            writer.append("\n");
            writer.write(String.format("%s%41.2f", "Итого:", totalCoast));
        }


        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}








