package ru.mirea.lab1;

import java.util.Random;

public class Fourth {

    public static void main(String[] args) {
        int[] arr1 = new int[25];
        int[] arr2 = new int[25];

        Random rnd = new Random();

        for (int i = 0; i < 25; ++i) {
            arr1[i] = (int)(Math.random()*100);
            arr2[i] = rnd.nextInt(100);
        }

        for(int i : arr1) System.out.print(i + " ");
        System.out.println();
        for(int i : arr2) System.out.print(i + " ");
    }
}
