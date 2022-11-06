package ru.mirea.lab6;

public class Car implements Nameable, Priceable{
    private String number;
    private int price;
    public Car(String number, int price){
        this.number = number;
        this.price = price;
    }

    @Override
    public String getName() {
        return number;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
