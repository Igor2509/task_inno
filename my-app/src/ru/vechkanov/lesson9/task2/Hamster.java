package ru.vechkanov.lesson9.task2;

public class Hamster extends Animal implements Runner, Swimmer {


 @Override
 public void run() {
    System.out.println(this.getName() + " бегает по колесу");
 }

 @Override
 public void swim() {
  System.out.println(this.getName() + " плавает в ванночке");

  }

 @Override
 public void setName(String name) {
     super.name = name;



 }

 @Override
 public String getName() {
  return super.name;



      }



}
