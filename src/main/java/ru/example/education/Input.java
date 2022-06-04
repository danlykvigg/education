package ru.example.education;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое число:)");
        int x = s.nextInt();
        System.out.println("Вы ввели " + x);
    }
}
