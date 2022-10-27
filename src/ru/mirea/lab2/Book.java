package ru.mirea.lab2;

public class Book {
    private Author author;
    private String name;
    private Date dateOfPublishing;

    public Book(Author author, String name, Date dateOfPublishing){
        this.author = author;
        this.name = name;
        this.dateOfPublishing = dateOfPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(Date dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }

    @Override
    public String toString() {
        return (author.getName() + " " + name + " " + dateOfPublishing.toString());
    }
}
