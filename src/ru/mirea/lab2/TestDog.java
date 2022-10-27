package ru.mirea.lab2;

import java.util.Scanner;

public class TestDog {
    private int size;
    private Dog[] dogs;
    private String[] data;
    public TestDog(int size){
        this.size = size;
        dogs = new Dog[this.size];
        data = new String[this.size];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < this.size; ++i){
            String name = in.next();
            int age = in.nextInt();
            dogs[i] = new Dog(name, age);
            data[i] = name + " " + Integer.toString(age) + " (" + Integer.toString(age*7)+")";
        }
    }
    public void test(){
        for(int i = 0; i < this.size; ++i){
            if(dogs[i].ToString().equals(data[i])) System.out.println(dogs[i].ToString() + " = " + data[i]);
            else System.out.println("Error! " + dogs[i].ToString() + " != " + data[i]);
        }
    }
}
