package ru.mirea.lab4;

public class Ball {
    private double x;
    private double y;
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
