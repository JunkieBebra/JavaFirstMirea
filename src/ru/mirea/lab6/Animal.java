package ru.mirea.lab6;

public class Animal implements Nameable, Priceable{
    private String specie;
    private int price;
    public Animal(String specie, int price){
        this.specie = specie;
        this.price = price;
    }

    @Override
    public String getName() {
        return specie;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
