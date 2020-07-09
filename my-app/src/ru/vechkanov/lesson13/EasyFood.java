package ru.vechkanov.lesson13;

public class EasyFood implements Fooder {
    @Override
    public void foodSelection(String nameFood) {
        System.out.printf("Съел %s за обе щеки\n", nameFood);
    }

}
