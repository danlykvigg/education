package org.example.education;

public class Lesson19 {
    public static void main(String[] args) {
        human human1 = new human();
        human1.setAge(27);
        human1.setName("Vlad");
        human1.getInfo();
        human human2 = new human();
        human2.setAge(27);
        human2.setName("Stas");
        human2.getInfo();
    }
}
class human{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + ", " + age);
    }

}

