package ru.mirea.lab1;

import java.util.Scanner;

public class Five {

    private static void factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; ++i){
           fact *= i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        factorial(inp.nextInt());
    }
}
