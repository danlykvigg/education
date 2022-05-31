package ru.example.education.lesson33;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ///////////// Java 5 ////////////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog"); // 1
        animals.add("frog");


        String animal = (String) animals.get(1);
        System.out.println(animal);

        ////////////////////// С появлением дженериков //////////////////////
        List<String> animals2 = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

       String animal2 = animals2.get(1);

       //////////////// Java 7 //////////////////
        List<String> animals3 = new ArrayList<>();
    }
}