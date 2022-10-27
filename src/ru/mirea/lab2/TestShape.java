package ru.mirea.lab2;

import java.util.Scanner;

public class TestShape {
    private int iteration = 1;

    public TestShape(){
        this.test();
    }
    public void test(){
        Shape t = new Shape(iteration);
        System.out.println(t.toString());
        iteration += 1;
        if(iteration > 4) return;
        this.test();
    }
}
