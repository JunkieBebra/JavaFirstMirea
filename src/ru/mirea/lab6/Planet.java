package ru.mirea.lab6;

public class Planet implements Nameable, Priceable{
    private String name;
    private int price;
    public Planet(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
