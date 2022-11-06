package ru.mirea.lab7;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        super();
        width = 1;
        length = 1;
    }
    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String colour, boolean filled){
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + length * 2;
    }

    @Override
    public String toString() {
        return Double.toString(this.length) + " " + Double.toString(this.width) + " " + this.colour + " " + Boolean.toString(this.filled);
    }
}
