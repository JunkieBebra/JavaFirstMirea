package ru.mirea.lab2;

import java.util.Random;

public class TestBall {
    public TestBall(){
        this.test();
    }
    public void test(){
        Random rnd = new Random();
        Ball b = new Ball(rnd.nextDouble(100),rnd.nextDouble(100));
        System.out.println(b.getX() + " " + b.getY());
        double nX = rnd.nextDouble();
        double nY = rnd.nextDouble();
        b.setX(nX);
        b.setY(nY);
        System.out.println(nX + " " + b.getX() +" ; " + nY + " " + b.getY());
        nX = rnd.nextDouble();
        nY = rnd.nextDouble();
        b.setXY(nX, nY);
        System.out.println(nX + " " + b.getX() +" ; " + nY + " " + b.getY());
        nX = rnd.nextDouble();
        nY = rnd.nextDouble();
        b.move(nX, nY);
        System.out.println(b.toString());
    }

}
