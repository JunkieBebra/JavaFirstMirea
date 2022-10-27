package ru.mirea.lab2;

import java.util.Scanner;

public class testBook {
    public testBook(String[] args) {this.test(args);}
    public void test(String[] args){
        if(args.length == 0){
            Scanner inp = new Scanner(System.in);
            Book b = new Book(new Author(inp.next(), inp.next(), inp.next().charAt(0)), inp.next(), new Date(inp.nextInt(), inp.nextInt(), inp.nextInt()));
            System.out.println(b.toString());
        }
        else{
            Book b = new Book(new Author(args[0], args[1], args[3].charAt(0)), args[4], new Date(Integer.parseInt(args[5]), Integer.parseInt(args[6]), Integer.parseInt(args[7])));
            System.out.println(b.toString());
        }
    }
}
