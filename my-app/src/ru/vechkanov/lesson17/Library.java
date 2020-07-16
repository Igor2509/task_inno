package ru.vechkanov.lesson17;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class Library implements Addable, Serializable, Rebootable {

    List<Book> books = new ArrayList<>();


    @Override
    public void addBooks(Book book) {
        books.add(book);
    }

    @Override
    public void getAddBooks() {
        for (Book book : books
        ) {
            System.out.println(book.toString());
        }
    }


    @Override
    public void rebootSave(String name) {

        try (
            FileOutputStream outputStream = new FileOutputStream(name);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(this);

        } catch (IOException e) {
            System.out.println(e.toString());

        }



    }

    @Override
    public Library rebootLoad(String name) throws IOException {
        if (new File(name).exists()) {
            try (
                    FileInputStream fileInputStream = new FileInputStream("save.dat");
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

                    return (Library) objectInputStream.readObject();

            } catch (FileNotFoundException | ClassNotFoundException ex) {
                System.out.println(ex.toString());
            }


        } else {
            System.out.println("Данного файла на диске не существует");

        }
        return new Library();

    }

}
