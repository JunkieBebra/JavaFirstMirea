package ru.mirea.lab5;

public class Plate extends Dish{
    private String size;
    public Plate(String content, String size){
        super(content);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Plate{" +
                "size='" + size + '\'' +
                '}';
    }
}
