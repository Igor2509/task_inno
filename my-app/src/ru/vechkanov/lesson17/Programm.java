package ru.vechkanov.lesson17;

import java.io.IOException;

public class Programm {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Book book1 = new Book();
        String backupfile = "save.dat";
        book1.setName("Война и мир");
        book1.setAuthor("Л.Н.Толстой");
        book1.setYear(1865);
        Book book2 = new Book();
        book2.setName("Преступление и наказание");
        book2.setAuthor("Ф.М. Достоевский");
        book2.setYear(1989);
        Addable library = new Library();
        library.addBooks(book1);
        library.addBooks(book2);
        library.getAddBooks();
        Rebootable rebootlibrary = (Rebootable) library;
        rebootlibrary.rebootSave(backupfile);
        System.out.println("Восстанвливаем данные: ");
        Library lib = rebootlibrary.rebootLoad(backupfile);
        lib.getAddBooks();
    }



}
