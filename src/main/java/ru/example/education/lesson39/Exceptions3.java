package ru.example.education.lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args){
        // Checked Exception(compile time exception) = исключительные случаи в работе программы
        // Unchecked Exception(Runtime exception) = ошибка в работе программы

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
