package ru.vechkanov.lesson13;

public class Child {



        public void eat(String name) throws ExceptionFood {
            String nameFood = name.toUpperCase();
            if (Foods.APPLE.toString().equals(nameFood)||Foods.PIZZA.toString().equals(nameFood)||Foods.MILK.toString().equals(nameFood)) {
                       Fooder foodeat = new EasyFood();
                       foodeat.foodSelection(nameFood);


                } else if (Foods.CARROT.toString().equals(nameFood)||Foods.BROCCOLI.toString().equals(nameFood)) {
                    Fooder foodeat = new BadFood();
                    foodeat.foodSelection(nameFood);


                    }

                }
            }












