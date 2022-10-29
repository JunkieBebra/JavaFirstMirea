package ru.mirea.lab4;

import java.util.Scanner;

public class TestBall {
    public TestBall() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        Ball b = new Ball(x, y);
        double mX = in.nextDouble();
        double mY = in.nextDouble();
        if((b.getX() == x)&&(b.getY() == y)){
            System.out.println("Constructor is working correctly");
        }
        b.move(mX, mY);
        if((b.getX() == x+mX)&&(b.getY() == y+mY)){
            System.out.println("Move function is working correctly");
        }
        b.toString();
    }
}
