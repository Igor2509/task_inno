package ru.vechkanov.lesson18;



public class Main {


    public static void main(String[] args) {

        if(args.length < 4) {
            System.out.println("в параметрах нужно указать:");
            System.out.println("имя входного файла");
            System.out.println("кодировку входного файла");
            System.out.println("имя выходного файла");
            System.out.println("кодировку выходного файла");
            return;
        }
        String filename1=args[0];
        String charset1=args[1];
        String filename2=args[2];
        String charset2=args[3];



        Coder coder = new Coder(filename1, charset1, filename2, charset2);
        coder.coder();




    }

}