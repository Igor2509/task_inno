package ru.vechkanov.lesson13;

public class BadFood implements Fooder {


    @Override
    public void foodSelection(String nameFood) throws ExceptionFood{
        throw new ExceptionFood("Еда мне не понравилась");
    }
}
