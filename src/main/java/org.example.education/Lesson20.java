package org.example.education;

public class Lesson20 {
    public static void main(String[] args) {
        people people1 = new people();
    }
}

class people {
    private String name;
    private int age;

    public people(){
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public people(String name){
        System.out.println("Пиривет из второго конструктора");
        this.name = name;
    }

    public people(String name, int age){
        System.out.println("Пиривет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}