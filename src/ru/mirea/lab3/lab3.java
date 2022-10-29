package ru.mirea.lab3;

import ru.mirea.lab2.TestDog;

import java.util.Scanner;

public class lab3 {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        Human h = new Human(in.next().charAt(0), in.next().charAt(0),in.next().charAt(0),in.next().charAt(0));
        System.out.println(h.toString());
    }
}
