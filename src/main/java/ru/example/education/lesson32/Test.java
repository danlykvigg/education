package ru.example.education.lesson32;

public class Test {
    public static void main(String[] args) {
       Animal a = new Animal();
       Dog dog = (Dog) a;
        dog.bark();
    }
}
