package ru.mirea.lab3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Circle[] circles = new Circle[n];
        for(int i = 0; i < n; ++i){
            circles[i] = new Circle(in.nextDouble());
        }
        for(int i = 0; i < n; ++i){
            for(int j = i + 1; j < n; ++j){
                if(circles[i].isEqual(circles[j])){
                    System.out.println(circles[i].getRadius() + " = " + circles[j].getRadius());
                }
                else{
                    System.out.println(circles[i].getRadius() + " != " + circles[j].getRadius());
                }
                System.out.println(circles[i].Square() + " " + circles[i].Perimeter());
                System.out.println(circles[j].Square() + " " + circles[j].Perimeter());
            }
        }
    }
}
