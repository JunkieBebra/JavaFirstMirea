package ru.mirea.lab4;

import java.util.Scanner;

public class TestAuthor {
    public TestAuthor(){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String email = in.next();
        char gender = in.next().charAt(0);
        Author a = new Author(name, email, gender);
        if(a.getEmail().equals(email) && a.getName().equals(name) && a.getGender() == gender){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect");
        }
        System.out.println(a.toString());
    }
}
