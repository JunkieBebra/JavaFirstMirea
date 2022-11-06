package ru.mirea.lab7;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        super();
        this.radius = 1;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String colour, boolean filled){
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return Double.toString(this.radius) + " " + this.colour + " " + Boolean.toString(this.filled);
    }
}
