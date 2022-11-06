package ru.mirea.lab7;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String colour, boolean filled){
        super(side, side, colour, filled);
    }
    public double getSide() {
        return this.length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return Double.toString(this.length) + " " + this.colour + " " + Boolean.toString(this.filled);
    }
}
