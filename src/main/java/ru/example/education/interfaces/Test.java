package ru.example.education.interfaces;

import ru.example.education.Info;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        outputInfo(info1);
        outputInfo(info2);
    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}

