package ru.example.education.lesson45;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Mike");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            oos.writeObject(person1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
