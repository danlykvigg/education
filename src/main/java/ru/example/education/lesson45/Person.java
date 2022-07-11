package ru.example.education.lesson45;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -339953568979759774L;

    private int id;
    private String PersonName;
    private int age;
    private  byte type;



    public Person(int id, String name) {
        this.id = id;
        this.PersonName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return PersonName;
    }

    public String toString() {
        return id + " : " + PersonName;
    }
}
