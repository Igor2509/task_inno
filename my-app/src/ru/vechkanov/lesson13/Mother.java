package ru.vechkanov.lesson13;

public class Mother {
    public static void main(String[] args) {
        Child child = new Child();
        try {
            child.eat("APPLE");
            child.eat("CARROT");
        } catch (ExceptionFood e){
            System.out.println(e.getMessage());
        } finally { System.out.println("Спасибо мам");}
    }




}
