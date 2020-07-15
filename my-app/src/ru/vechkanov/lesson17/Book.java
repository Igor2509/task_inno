package ru.vechkanov.lesson17;

import java.io.Serializable;

public class Book implements Serializable{

        private static final int serialVersionUID = 1;
        private String author = "";
        private String name = "";
        private int year = 0;

        public Book() {
        }

        public String getName() {
            return (this.name);
        }


        public void setAuthor(String value) {
            this.author = value;
        }
        public void setName(String value) {
            this.name = value;
        }
        public void setYear(int year) {
            this.year = year;
        }

        public String toString() {
            return ("Книгу " + this.name + " написал " + this.author + " год издания: " + this.year);
        }
    }



