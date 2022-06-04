package ru.example.education;

public class Lesson20 {
    public static void main(String[] args) {
        People p1 = new People("Bob", 40);
        System.out.println(p1);

    }
}

class People {
    private String name;
    private int age;

    public People(String name, int age){
    this.name = name;
    this.age = age;
    }

    public String toString(){
        return name+","+age;
    }

}
