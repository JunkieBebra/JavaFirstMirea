package ru.mirea.lab5;

public abstract class Dish {
    private String content;
    public Dish(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "content='" + content + '\'' +
                '}';
    }
}
