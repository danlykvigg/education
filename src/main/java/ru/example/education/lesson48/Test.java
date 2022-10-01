package ru.example.education.lesson48;

public class Test {

    public static void main(String[] args) {
       Season season = Season.AUTUMN;
       Animal animal = Animal.CAT;
        System.out.println(animal.name());

       Animal cat = Animal.valueOf("CAT");
    }
}
