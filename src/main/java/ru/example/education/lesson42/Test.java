package ru.example.education.lesson42;

public class Test {
    public static void main(String[] args) {
        String string1 = "Hello!";            //  string1       ->        {"Hello"}
        String string2 = "Hello123";         //  string2

        System.out.println(string1 == string2);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;

        return this.id == otherAnimal.id;
    }
}
