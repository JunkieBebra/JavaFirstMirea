package ru.mirea.lab1;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        int n;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) arr[i] = inp.nextInt();

        int sum = 0;

        for(int i = 0; i < n; ++i){
            sum += arr[i];
        }
        System.out.println(sum);
        sum = 0;

        int j = 0;
        while(j < n){
            sum += arr[j];
            j++;
        }
        System.out.println(sum);
        sum = 0;
        j = 0;

        do{
            sum += arr[j];
            j++;
        } while(j < n);
        System.out.println(sum);
    }
}
