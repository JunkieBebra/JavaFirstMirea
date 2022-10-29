package ru.mirea.lab3;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double nRadius){radius = nRadius;}
    public double getRadius(){return radius;}
    public double Square(){return radius * radius * Math.PI;}
    public double Perimeter(){return 2 * radius * Math.PI;}
    public Boolean isEqual(Circle circle){
        return (this.radius == circle.getRadius());
    }
}
