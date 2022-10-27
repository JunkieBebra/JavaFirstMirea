package ru.mirea.lab2;

public class Author {
    private final String name;
    private String eMail;
    private final char gender;

    public Author(String name, String eMail, char gender){
        this.name = name;
        this.eMail = eMail;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String getEMail(){
        return this.eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return (gender + " " + name + " (" + eMail + ")");
    }
}
