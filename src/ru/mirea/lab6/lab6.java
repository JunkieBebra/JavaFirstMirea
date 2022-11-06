package ru.mirea.lab6;

public class lab6 {
    public static void main(String[] args){
        Animal a = new Animal("Hippopotamus", 11000);
        Planet p = new Planet("Venus", 100000000);
        Car c = new Car("LE1337ET", 12000);
        System.out.println(a.getName() + " " + p.getName() + " " + c.getName());
        System.out.println(a.getPrice() + " " + p.getPrice() + " " + c.getPrice());
    }
}
