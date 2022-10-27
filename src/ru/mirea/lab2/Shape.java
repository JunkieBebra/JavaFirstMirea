package ru.mirea.lab2;

public class Shape {
    private int type;
    public Shape(int t){
        type = t;
    }

    @Override
    public String toString(){
        if(type == 1) return "Rectangle";
        if(type == 2) return "Triangle";
        if(type == 3) return "Circle";
        return "Unknown";
    }
}
